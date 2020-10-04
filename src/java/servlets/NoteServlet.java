/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;
import domain.Note;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 809968
 */
public class NoteServlet extends HttpServlet {
    private String path; 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));  
        
        
        String edit = request.getParameter("edit");
        String title_ini = br.readLine();
        String content_ini = br.readLine();
        
        Note note = new Note(title_ini, content_ini);
        request.setAttribute("note",note);
        br.close();
        if(edit != null){              
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);  
        }   
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);     
     }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String titles = request.getParameter("Title");
            String contents = request.getParameter("Content");
            path = getServletContext().getRealPath("/WEB-INF/note.txt");
            Note newNote = new Note(titles, contents);
            
              if (titles == null || titles.equals(" ") ||
                      contents == null || contents.equals(" ")) {                 
            request.setAttribute("invalid", true);
            request.setAttribute("note", newNote);
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
            return;
        }
            request.setAttribute("title", titles);
            request.setAttribute("content", contents);  
            
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 
            pw.printf("%s%n, %s",titles, contents);
 
            pw.close();
            
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }

}
