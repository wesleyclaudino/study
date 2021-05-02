import { Component, OnInit } from '@angular/core';

import { CursoService } from './curso.service';

@Component({
  selector: 'app-curso',
  templateUrl: './curso.component.html',
  styleUrls: ['./curso.component.css']
})
export class CursoComponent implements OnInit {

  curso: string[];

  constructor(private cursoService: CursoService) { 

    var servico = new CursoService();

    this.curso = this.cursoService.getCurso();

  }

  ngOnInit(): void {
  }

}
