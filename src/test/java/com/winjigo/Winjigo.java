package com.winjigo;

import com.winjigo.pages.Course;
import com.winjigo.pages.Home;
import com.winjigo.pages.Login;

public class Winjigo {
    public Login login;
    public Home home;

    public Course course;
    public Winjigo() {
        login = new Login();
        home = new Home();
        course = new Course();
    }
}
