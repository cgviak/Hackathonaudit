package hackathon;
import java.util.*;
public class Audit {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String [] audits = {"SPID", "SPEI", "BDT"};
		String [] findings = {"cumple", "no cumple"};
		
		String auditoria, resultados;
		
			System.out.println ("Selecione una auditoría:");
			auditoria = sc.nextLine();
			
			if (auditoria == "spid") {
				int regs []	= {1, 2, 3, 4, 5};
				for (int req : regs) {

				System.out.println ("Cuál Requerimiento?");
				req = sc.nextInt ();
				
			switch (req) {
			case 1:
				String comment;
				System.out.println ("Texto de la regulación");
				System.out.print ("La empresa cumple con el requisito?");
				resultados = sc.nextLine();
				System.out.println ("Comentarios de Auditoría: ");
				comment = sc.nextLine ();
				System.out.println ("Incluir anexo.");
				break;
			}
			}
			} else if (auditoria == "SPEI") {
				
			} else if (auditoria == "BDT") {
				
			} else {
				System.out.print("valor invalido. no consta en nuestros sistemas.");
			}
		}
}
