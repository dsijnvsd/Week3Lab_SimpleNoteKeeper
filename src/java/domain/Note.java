/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import com.sun.xml.internal.ws.developer.Serialization;
import java.lang.annotation.Annotation;


public class Note implements Serialization{
    private String first_line;
    private String second_line;

    public Note(String first_line, String second_line) {
        this.first_line = first_line;
        this.second_line = second_line;
    }

    public String getFirst_line() {
        return first_line;
    }

    public void setFirst_line(String first_line) {
        this.first_line = first_line;
    }

    public String getSecond_line() {
        return second_line;
    }

    public void setSecond_line(String second_line) {
        this.second_line = second_line;
    }

    @Override
    public String toString() {
        return "Note{" + "first_line=" + first_line + ", second_line=" + second_line + '}';
    }

    @Override
    public String encoding() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
