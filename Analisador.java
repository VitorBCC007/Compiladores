package lexico; 

public class Analisador {
    Entrada ent; 

    public Analisador(String arquivo){
        ent = new Entrada(arquivo);
    }
    /*Implementação Inicial --> ignorar espaços em branco
     * isread retorna -1 quando finaliza a leitura
     */
    public Token proximToken(){
        int caractereLido = -1;
        while ((caractereLido = ent.LerProximoCaractere())!= -1){
            char c = (char)caractereLido;

            //Token Com único caractere 
            if (c == ' '|| c == '\n'){
                continue;
            }
            if(c == '*'){
                return new Token(TipoToken.OprAritMult, "*");
            } else if (c == '+'){
                return new Token(TipoToken.OprArtSoma, "+");              
            }
            //relacionais (implementar alguma lógica para dois caracteres)
            else if (c== '<'){
                c = (char)ent.LerProximoCaractere();
                if(c=='>'){
                    return new Token(TipoToken.OprRelDif, "<>");
                }
                else if (c == '='){
                    return new Token(TipoToken.OprRelIgual, "=");
                }
                else{
                    return new Token(TipoToken.OprRelMenor, "<");
                }
            }
        }
        return null;
    }
        

 }
    
    
    

