// incluye solamente el back-end. Proyecto desarollado en Java debido a su seguridad.
package hackathon;
import java.util.*;
public class Audit {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String [] audits = {"SPID", "SPEI", "BDT"};
		String [] findings = {"cumple", "no cumple"};
		
		String auditoria, resultados;
		
			System.out.println ("Selecione una auditoría:"); // entre la lista (linea 8)
			auditoria = sc.nextLine();
			
			if (auditoria == "spid") {
				int regs []	= {1, 2, 3, 4, 5}; // la cantidad de puntos regulatorios
				for (int req : regs) {

				System.out.println ("Cuál Requerimiento?");
				req = sc.nextInt ();
				
			switch (req) {
			case 1:
				String comment;
				System.out.println ("Texto de la regulación"); // incluye el texto de la Regulación SPID punto 1
				System.out.print ("La empresa cumple con el requisito?"); //Opción cumple o no cumple (linea 9)
				resultados = sc.nextLine();
				System.out.println ("Comentarios de Auditoría: "); // Auditor incluye sus papeles de trabajo.
				comment = sc.nextLine ();
				System.out.println ("Incluir anexo."); // en el futuro, desarollaremos una herramienta para anexar archivos.
					//incluir una tolerancia de riesgo menor (caso la empresa lo exige)... más espacio para papeles de trabajo
				break;
			}
			}
			} else if (auditoria == "SPEI") { //solamente como proof-of-concept... seción sigue los mismos parametros.
				
			} else if (auditoria == "BDT") { //solamente como proof-of-concept... seción sigue los mismos parametros.
				
			} else {
				System.out.print("valor invalido. no consta en nuestros sistemas.");
			}
		}
}
