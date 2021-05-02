import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CursoService {

  getCurso(){
    return 'Bem Vindo!'
  }

  constructor() { }
}
