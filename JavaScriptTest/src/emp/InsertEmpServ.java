package emp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertEmpServ")
public class InsertEmpServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public InsertEmpServ() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpDAO dao = new EmpDAO();
		//����� �Է��� �׸��� ����
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String hireDate = request.getParameter("hireDate");
		String jobid = request.getParameter("jobid");
		String salary = request.getParameter("salary");
		System.out.println(email);
		System.out.println(hireDate);
		System.out.println(jobid);
		System.out.println(salary);

		Employee emp = new Employee();
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setEmail(email);
		emp.setHireDate(hireDate);
		emp.setJobId(jobid);
		emp.setSalary(Integer.parseInt(salary));
		
		dao.insertEmp(emp);	
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
