/**
 * Décrivez votre classe Client ici.
 *
 * @author (KETAM)
 * @version (03-10-2017)
 */
public class Client
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nomClient;
    private Serveur serveur;

    /**
     * Constructeur d'objets de classe Client
     */
    public Client(String nom)
    {
        this.nomClient = nom;
        this.serveur = null;
    }

    public boolean seConnecter(Serveur serveur)
    {
        boolean connection;
        connection= serveur.connecter(this);
        if(connection== false) //On ne peut pas se connecter
            return false;
        else {
            this.serveur = serveur;
            return true;
        }
    }
    
    public void envoyer(String outMessage)
    {
        if(serveur != null)
            serveur.diffuser(nomClient + "- -" + outMessage);
    }
    
    public String recevoir(String inMessage)
    {
        return inMessage;
    }
}
