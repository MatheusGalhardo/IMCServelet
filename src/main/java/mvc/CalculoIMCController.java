package mvc;

import java.io.IOException;
import static java.lang.System.out;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/mvc/calculo-imc")
public class CalculoIMCController extends HttpServlet {
	
	@Override
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//Prepara para a execução.
		String alturaStr = request.getParameter("altura");
		alturaStr = alturaStr == null ? "0" : alturaStr;
		if(alturaStr.contains(",")){
			alturaStr = alturaStr.replace(",", ".");
		}
		float altura = Float.parseFloat(alturaStr);
                String pesoStr = request.getParameter("peso");
		pesoStr = pesoStr == null ? "0" : pesoStr;
		if(alturaStr.contains(",")){
			alturaStr = alturaStr.replace(",", ".");
		}
		float peso = Float.parseFloat(pesoStr);
		String imcStr = request.getParameter("imc");
                imcStr = imcStr == null ? "0" : imcStr;
                float imc = Float.parseFloat(imcStr);
                String condicaoStr = request.getParameter("condicao");
                condicaoStr = condicaoStr == null ? "0" : condicaoStr;
                String condicao = condicaoStr;
		//Executa "regras de negócio".
		CalculoIMCModel calculoImcModel = new CalculoIMCModel();
                
		Float calcularimc = calculoImcModel.calcularimc(peso, altura);
                String condicaoIMC = calculoImcModel.condicaoIMC(calcularimc);
		//Passa a váriável para a página JSP.
			if (peso <0 || altura <0 || calcularimc == 0){
                    condicaoIMC = "IMC invaliado! Tente novamente";
                    calcularimc = null;
                    
                }
			else if (peso ==0 && altura ==0){
				
				calcularimc = null;
			}
                else if (peso >0 || altura>0){
                    out.println(condicaoIMC);
                    out.println(calcularimc);
                }
		request.setAttribute("calcularimc", calcularimc);
                request.setAttribute("condicao", condicaoIMC);  
		//Chama página JSP.
		request.getRequestDispatcher("CalculoIMCServlet.jsp").
			forward(request, response);
                
               	}
	
}
