/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoirtestsunitaires;

import devoirtestsunitaires.Condition;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jbuffeteau
 */
public class ConditionTest {
    
    public ConditionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Valider method, of class Condition.
     */
    @Test
    public void testValider() {
        
        // Test 1 = le nombre de jours ne dépasse pas 30 jours
        
         boolean expected = true;
         boolean actual = Condition.Valider(24);
         assertEquals(expected, actual);
        
        // Test 2 = le nombre de jours dépasse 30 jours
         expected = false;
         actual = Condition.Valider(34);
         assertEquals(expected, actual);
    }

    /**
     * Test of CalculerMontantMaxCategorie method, of class Condition.
     */
    @Test
    public void testCalculerMontantMaxCategorie() {
        
        // Test 1 = Pour la catégorie Livre
        int expected = 30;
         int actual = Condition.CalculerMontantMaxCategorie("Livre");
         assertEquals(expected, actual);
        
        // Test 2 = Pour la catégorie Jouet

         expected = 50;
         actual = Condition.CalculerMontantMaxCategorie("Jouet");
         assertEquals(expected, actual);
        // Test 3 = Pour la catégorie Informatique
          expected = 1000;
         actual = Condition.CalculerMontantMaxCategorie("Informatique");
         assertEquals(expected, actual);
    }

    /**
     * Test of CalculerMontantRembourse method, of class Condition.
     */
    @Test
    public void testCalculerMontantRembourse() {
        
        // Test 1
        int nbJours = 20 ; 
         String Catégorie = "Livre" ;
        String Etat = "Abimé" ; 
         boolean Membre = true ;
         int Prix = 50;
       double actual =Condition.CalculerMontantRembourse(nbJours, Catégorie, Membre, Etat, Prix);
//        assertEquals(20,"Livre",true,"Abimé",50,actual);
        // Test 2 = nbJours = 15 ; Catégorie = Livre ; Etat = Très abimé ; Membre = false ; Prix = 24


        // Test 3 = nbJours = 15 ; Catégorie = Livre ; Etat = Neuf ; Membre = true ; Prix = 24

    }

    /**
     * Test of CalculerReductionMembre method, of class Condition.
     */
    @Test
    public void testCalculerReductionMembre() {
        
        // Test 1 = Je ne suis pas membre
    
      double expected = 0.2;
        double actual = Condition.CalculerReductionMembre(false);
         assertEquals(expected, actual,0.2);
        
        // Test 2 = Je suis membre
         expected = 0;
         actual = Condition.CalculerReductionMembre(true);
         assertEquals(expected, actual,0.0);

    }

    /**
     * Test of CalculerReductionEtat method, of class Condition.
     */
    @Test
    public void testCalculerReductionEtat() {
        
        // Test 1 = Pour un état Abimé
        
        
        
        double expected =0.3;
        double actual = Condition.CalculerReductionEtat("Abimé");
         assertEquals(expected, actual,0.0);
        
        // Test 2 = Pour un état Très abimé
        expected =0.3;
        actual = Condition.CalculerReductionEtat("Très Abimé");
         assertEquals(expected, actual,0.0);
        
        // Test 3 = Pour un état Neuf
        expected =0.1;
        actual = Condition.CalculerReductionEtat("Neuf");
        assertEquals(expected, actual,0.0);
    }
}
