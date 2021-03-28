/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentodeexcecao;

/**
 *
 * @author br101
 */
public class TratamentoDeExcecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            System.out.println(7 / 0);
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
        
        Aluno a1 = null;
        
        try{
        
        imprimirNomeDoAluno(a1);
        } catch(Exception excecao) {
            System.out.println("Erro ao imprimir "
                    + "o nome do usuário ");
            
        }
      
    } 
    
    public static void imprimirNomeDoAluno (Aluno aluno){
        
        
        System.out.println(aluno.nome);
        
        
    }
    
    
    
}
