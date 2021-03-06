package equipe_25.Metier;


import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import equipe_25.Metier.Pilier;
import equipe_25.Controleur;

/*---------Constructeur-----------*/
public class Architecte implements MouseListener
{
    /*----- Attributs -----*/

    private String couleur;

    private Controleur ctrl ;

    /*----- Score -----*/

    private int nbDalle = 0;

    private int nbPilierDetruit = 0;

    /*----- Constructeur -----*/

    public Architecte(String couleur,Controleur ctrl)
    {
        this.couleur = couleur;
        this.ctrl    = ctrl ;
    }

    /*----- Getteur -----*/

    public int     getNbDalle         () { return this.nbDalle;          }
    public String  getCouleur         () { return this.couleur;          }
    public int     getNbPilierDetruit () { return this.nbPilierDetruit;  }

    /*----- Setteur -----*/

    public void ajouterDalle        () { this.nbDalle++;          }
    public void ajouterPilierDetruit() { this.nbPilierDetruit++;  }
    public void supprimerDalle      () { this.nbDalle-- ;         }

    /*-------MouseListener-------*/

    public void mousePressed(MouseEvent e)
    {
        if (this.ctrl.jouer(e.getX(),e.getY(),this.couleur))
        {
            this.ctrl.maj();
        }
    }

    public void mouseExited  (MouseEvent e){}
    public void mouseEntered (MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseClicked (MouseEvent e){}

    /*----- ToString() -----*/

    public String toString()
    {
        return "Joueur " + this.couleur          + ":" +
        "\n Possède "    + this.nbDalle          + " dalle(s)" +
        "\n A détruit "  + this.nbPilierDetruit + " pilier(s)\n";
    }
}