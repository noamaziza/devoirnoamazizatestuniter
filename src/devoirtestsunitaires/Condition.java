/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoirtestsunitaires;

/**
 *
 * @author jbuffeteau
 */
public class Condition
{
    static final int nbJours = 30;
     // Permet de savoir si on a le droit d'être remboursé
    // On l'est à condition que le nombre de jours ne dépasse pas 30 !
    // Voir la constante déclarée ci-dessus
    public static boolean Valider(int unNbDeJours)
    {
        if(unNbDeJours<=30)
        {
          return true;  
        }
        else
        {
           return false;
        }
        
    }
    // Permet de renvoyer le montant MAX remboursé en fonction de la catégorie
    // 30 pour Livre : si j'achète un livre à 14 euros ==> prix est de 14 ; si j'achète un livre à 54 euros ==> le prix est de 30
    // 50 pour Jouet
    // 1000 pour Informatique
    public static int CalculerMontantMaxCategorie(String uneCategorie)
    {
        int MontantRembourserMax =0;
        if( "Livre".equals(uneCategorie))
        {
            MontantRembourserMax=30;
        }
        if( "Jouet".equals(uneCategorie))
        {
            MontantRembourserMax=50;
        }
          if( "Informatique".equals(uneCategorie))
        {
            MontantRembourserMax=1000;
        }
          return MontantRembourserMax;
    }
    // Permet de retourner le total remboursé en fonction de tous les critères
    public static double CalculerMontantRembourse(int unNbDeJours, String uneCategorie,
            boolean estMembre, String unEtat,
            int unPrix)
    {
        double TotalRemboursé=0;
 
       
        return TotalRemboursé;
        
    }
    // Permet de renvoyer la réduction si on est membre ou pas
    // Membre  = 0.0
    // Pas membre = 0.2
    public static double CalculerReductionMembre(boolean estMembre)
    {
        // si j'initialise la ReductionMembre ici je ne peut pas lui donner de valeur  
        //donc je vais l'initialiser deux fois 
        //double ReductionMembre=0;
           if(estMembre= true)
        {
           double ReductionMembre=0;
            return ReductionMembre;
        }
          else
        {
          double ReductionMembre=0.2; 
          return ReductionMembre;
        }
       
    }
    // Permet de renvoyer la réduction en fonction de l'état de l'achat
    // Abimé ou Très abimé = 0.3
    // Pour tous les autres états = 0.1
    public static double CalculerReductionEtat(String unEtat)
    { 
            if("Abimé".equals(unEtat))
        {
          double ReductionEtat=0.3;
          return  ReductionEtat;
        }
            else if("Très Abimé".equals(unEtat))
        {
          double ReductionEtat=0.3;
           return  ReductionEtat;
        }  
            else
        {
           double ReductionEtat=0.1;
           return  ReductionEtat;
        }
       
    }
}
