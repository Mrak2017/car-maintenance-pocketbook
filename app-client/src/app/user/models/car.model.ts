import { CarDTO } from "../../../../build/openapi";

export class Car {
  id: string;
  date: Date;
  title: string;
  description: string;

  constructor(dto: CarDTO) {
    if (dto !== null) {
      this.id = dto.id;
      this.date = new Date(dto.date);
      this.title = dto.title;
      this.description = dto.description;
    }
  }

  static fromArrayDTO(dtos: CarDTO[]) {
    return dtos.map(dto => new Car(dto));
  }
}
