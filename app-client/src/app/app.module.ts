import { BrowserModule } from '@angular/platform-browser';
import { APP_INITIALIZER, NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserModule } from './user/user.module';
import { HttpClientModule } from '@angular/common/http';
import { ApiModule, Configuration, ConfigurationParameters } from './backend';
import { KeycloakAngularModule, KeycloakService } from 'keycloak-angular';
import { Location } from '@angular/common';

export function apiConfigFactory(): Configuration {
  const params: ConfigurationParameters = {
    basePath: '/api'
  };
  return new Configuration(params);
}

export const initializeKeycloak =
  (keycloak: KeycloakService, locationServ: Location) =>
    () => keycloak.init({
      config: {
        url: 'http://localhost:8080/auth',
        realm: 'carpocketbook',
        clientId: 'app-client',
      },
      initOptions: {
        enableLogging: true,
        onLoad: 'check-sso',
        silentCheckSsoRedirectUri: `${window.location.origin}${locationServ.prepareExternalUrl('/assets/silent-check-sso.html')}`,
      },
    });

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ApiModule.forRoot(apiConfigFactory),
    UserModule,
    KeycloakAngularModule
  ],
  providers: [
    {
      provide: APP_INITIALIZER,
      useFactory: initializeKeycloak,
      multi: true,
      deps: [KeycloakService, Location],
    },
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
