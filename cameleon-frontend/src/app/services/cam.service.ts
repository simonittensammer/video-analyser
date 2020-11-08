import { Injectable } from '@angular/core';
import {Cam} from '../models/cam';

@Injectable({
  providedIn: 'root'
})
export class CamService {
  selectedCam: Cam = new Cam(0, null, null, './assets/welcome.jpg');

  constructor() { }
}
