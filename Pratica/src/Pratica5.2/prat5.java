package Pratica5;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Iterator;

public class prat5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     int i;
	     ArrayList<String> RedeSocial = new ArrayList();

	    // [ B ] usando o m�todo add() para gravar 4 contatos na agenda
	    
	     do
	     {
	     String menu= JOptionPane.showInputDialog("MENU\n1-Cadastrar\n2-Excluir\n3-Pesquisar\n4-Sair");
	     i = Integer.parseInt(menu);
	     switch (i)
	        {
	             case 1:
	                String nome= JOptionPane.showInputDialog("Digite o Nome: ");
	                
	                String telefone= JOptionPane.showInputDialog("telefone: ");
	                
	                String insta= JOptionPane.showInputDialog("usu�rio do Instagram(@): ");
	                
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
		                
		                JOptionPane.showMessageDialog(null, "Exclu�do com Sucesso");
		                  } catch (IndexOutOfBoundsException e) {
		                      // exce��o lan�ada para indicar que um �ndice (i)
		                      // est� fora do intervalo v�lido (de 0 at� agenda.size()-1)
		                      System.out.printf("\nErro: posi��o inv�lida (%s).",
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
	                      // exce��o lan�ada para indicar que um �ndice (i)
	                      // est� fora do intervalo v�lido (de 0 at� agenda.size()-1)
	                      System.out.printf("\nErro: posi��o inv�lida.",
	                        e.getMessage());
	                  }
	                 break;
	                 
	             case 4:
	                    break;
	             default:
	                  JOptionPane.showMessageDialog(null, "Escolha uma das op��es v�lidas");
	        }
	     } while (i!=4);
	}

}


