import { Component } from '@angular/core';

@Component({
  selector: 'app-student-sign-up-form',
  templateUrl: './student-sign-up-form.component.html',
  styleUrls: ['./student-sign-up-form.component.css']
})
export class StudentSignUpFormComponent {
  welcomeMessage="ED-Tech";
  constructor(){
    // setTimeout(()=>{
    //   this.welcomeMessage="Please Signup here to continue";
    // }, 2000);
  }
}