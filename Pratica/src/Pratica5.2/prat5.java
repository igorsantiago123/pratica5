package Pratica5;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Iterator;

public class prat5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     int i;
	     ArrayList<String> RedeSocial = new ArrayList();

	    // [ B ] usando o método add() para gravar 4 contatos na agenda
	    
	     do
	     {
	     String menu= JOptionPane.showInputDialog("MENU\n1-Cadastrar\n2-Excluir\n3-Pesquisar\n4-Sair");
	     i = Integer.parseInt(menu);
	     switch (i)
	        {
	             case 1:
	                String nome= JOptionPane.showInputDialog("Digite o Nome: ");
	                
	                String telefone= JOptionPane.showInputDialog("telefone: ");
	                
	                String insta= JOptionPane.showInputDialog("usuário do Instagram(@): ");
	                
	                String mail= JOptionPane.showInputDialog("e-mail: ");
	                
	                RedeSocial.add(nome+";"+telefone+";"+ insta +";"+ mail);
	                JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
	                 break;
	             case 2:
	            	 String nomeexcluir= JOptionPane.showInputDialog("Digite o Nome: ");
	            	 try {
		                int n = RedeSocial.size();
		                for(i=0;i<n;i++) {
		                	if(RedeSocial.get(i).contains(nomeexcluir)) 
		                	{
		                		RedeSocial.remove(i);
		                		
		                	}
		                }
		                
		                JOptionPane.showMessageDialog(null, "Excluído com Sucesso");
		                  } catch (IndexOutOfBoundsException e) {
		                      // exceção lançada para indicar que um índice (i)
		                      // está fora do intervalo válido (de 0 até agenda.size()-1)
		                      System.out.printf("\nErro: posição inválida (%s).",
		                        e.getMessage());
		                  }
	                 break;
	             case 3:
	            	 String buscanome= JOptionPane.showInputDialog("Digite o Nome: ");
	            	 try {
			                int n = RedeSocial.size();
			                for(i=0;i<n;i++) {
			                	if(RedeSocial.get(i).contains(buscanome)) 
			                	{
			                		JOptionPane.showInternalMessageDialog(null, RedeSocial.get(i));
			                		
			                	}
			                	else if(!RedeSocial.get(i).contains(buscanome) && i==n-1){
			                		JOptionPane.showInternalMessageDialog(null, "\nErro: Nome invalido (%s).");
			                	}
			                }
	            	 } catch (IndexOutOfBoundsException e) {
	                      // exceção lançada para indicar que um índice (i)
	                      // está fora do intervalo válido (de 0 até agenda.size()-1)
	                      System.out.printf("\nErro: posição inválida.",
	                        e.getMessage());
	                  }
	                 break;
	                 
	             case 4:
	                    break;
	             default:
	                  JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas");
	        }
	     } while (i!=4);
	}

}


