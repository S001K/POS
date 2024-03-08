
import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class waiterFrame extends JFrame implements ActionListener {
	JButton buttonTable1;
	JButton buttonTable2;
	JButton buttonTable3;
	JButton buttonTable4;
	JButton buttonTable5;
	JButton buttonTable6;
	JButton buttonTable7;
	JButton buttonTable8;
	JButton buttonFoods;
	JButton buttonDrinks;
	JButton buttonCompleteOrder;

	JButton buttonBurger;
	JCheckBox cbBurgerPlainBread;
	JCheckBox cbBurgerSesameBread;
	JCheckBox cbBurgerDoubleBeef;
	JCheckBox cbBurgerSingleBeef;
	JCheckBox cbBurgerDoubleChicken;
	JCheckBox cbBurgerSingleChicken;
	JButton buttonOrderBurger;

	JButton buttonPizza;
	JCheckBox cbPizzaFlatBread;
	JCheckBox cbPizzaYeastedBread;
	JCheckBox cbPizzaSmall;
	JCheckBox cbPizzaMedium;
	JCheckBox cbPizzaLarge;
	JButton buttonOrderPizza;

	JButton buttonPasta;
	JCheckBox cbPastaTomatoSauce;
	JCheckBox cbPastaAlfredoSauce;
	JCheckBox cbPastaSpaghetti;
	JCheckBox cbPastaFusilli;
	JCheckBox cbPastaFarfalle;
	JButton buttonOrderPasta;

	JButton buttonBeer;
	JCheckBox cbTuborug;
	JCheckBox cbEfeys;
	JCheckBox cbKarlsberg;
	JCheckBox cbGlass;
	JCheckBox cbCan;
	JCheckBox cb33Cl;
	JCheckBox cb50Cl;
	JButton buttonOrderBeer;

	JButton buttonCocktail;
	JCheckBox cbVodka;
	JCheckBox cbGin;
	JCheckBox cbTequila;
	JCheckBox cbRom;
	JCheckBox cbSoda;
	JCheckBox cbLime;
	JCheckBox cbSalt;
	JCheckBox cbLongGlass;
	JCheckBox cbShortGlass;
	JButton buttonOrderCocktail;

	JButton buttonWine;
	JCheckBox cbDolucaRed;
	JCheckBox cbBuzbagRed;
	JCheckBox cbBuzbagRose;
	JCheckBox cbOneGlass;
	JCheckBox cbBottle;
	JButton buttonOrderWine;

	TextArea orderDisplay;

	waiterFrame() {
		orderDisplay = new TextArea(10, 40);
		orderDisplay.setBounds(30, 440, 1000, 200);
		orderDisplay.setEditable(false);

		buttonTable1 = new JButton();
		buttonTable1.setBounds(5, 5, 140, 30);
		buttonTable1.addActionListener(this);
		buttonTable1.setText("TABLE 1");
		buttonTable1.setFocusable(false);

		buttonTable2 = new JButton();
		buttonTable2.setBounds(5, 40, 140, 30);
		buttonTable2.addActionListener(this);
		buttonTable2.setText("TABLE 2");
		buttonTable2.setFocusable(false);

		buttonTable3 = new JButton();
		buttonTable3.setBounds(5, 75, 140, 30);
		buttonTable3.addActionListener(this);
		buttonTable3.setText("TABLE 3");
		buttonTable3.setFocusable(false);

		buttonTable4 = new JButton();
		buttonTable4.setBounds(5, 110, 140, 30);
		buttonTable4.addActionListener(this);
		buttonTable4.setText("TABLE 4");
		buttonTable4.setFocusable(false);

		buttonTable5 = new JButton();
		buttonTable5.setBounds(5, 145, 140, 30);
		buttonTable5.addActionListener(this);
		buttonTable5.setText("TABLE 5");
		buttonTable5.setFocusable(false);

		buttonTable6 = new JButton();
		buttonTable6.setBounds(5, 180, 140, 30);
		buttonTable6.addActionListener(this);
		buttonTable6.setText("TABLE 6");
		buttonTable6.setFocusable(false);

		buttonTable7 = new JButton();
		buttonTable7.setBounds(5, 215, 140, 30);
		buttonTable7.addActionListener(this);
		buttonTable7.setText("TABLE 7");
		buttonTable7.setFocusable(false);

		buttonTable8 = new JButton();
		buttonTable8.setBounds(5, 250, 140, 30);
		buttonTable8.addActionListener(this);
		buttonTable8.setText("TABLE 8");
		buttonTable8.setFocusable(false);

		buttonFoods = new JButton();
		buttonFoods.setBounds(150, 5, 140, 30);
		buttonFoods.addActionListener(this);
		buttonFoods.setText("FOODS");
		buttonFoods.setFocusable(false);
		buttonFoods.setVisible(false);

		buttonDrinks = new JButton();
		buttonDrinks.setBounds(150, 40, 140, 30);
		buttonDrinks.addActionListener(this);
		buttonDrinks.setText("DRINKS");
		buttonDrinks.setFocusable(false);
		buttonDrinks.setVisible(false);

		buttonCompleteOrder = new JButton();
		buttonCompleteOrder.setBounds(470, 645, 140, 30);
		buttonCompleteOrder.addActionListener(this);
		buttonCompleteOrder.setText("COMPLETE ORDER");
		buttonCompleteOrder.setFocusable(false);
		buttonCompleteOrder.setVisible(false);

		buttonBurger = new JButton();
		buttonBurger.setBounds(295, 5, 140, 30);
		buttonBurger.addActionListener(this);
		buttonBurger.setText("BURGER");
		buttonBurger.setFocusable(false);
		buttonBurger.setVisible(false);

		cbBurgerPlainBread = new JCheckBox("Plain Bread", true);
		cbBurgerPlainBread.setBounds(440, 5, 140, 30);
		cbBurgerPlainBread.setVisible(false);

		cbBurgerSesameBread = new JCheckBox("Sesame Bread", false);
		cbBurgerSesameBread.setBounds(440, 40, 140, 30);
		cbBurgerSesameBread.setVisible(false);

		cbBurgerSingleBeef = new JCheckBox("Single Beef", true);
		cbBurgerSingleBeef.setBounds(440, 75, 140, 30);
		cbBurgerSingleBeef.setVisible(false);

		cbBurgerDoubleBeef = new JCheckBox("Double Beef", false);
		cbBurgerDoubleBeef.setBounds(440, 110, 140, 30);
		cbBurgerDoubleBeef.setVisible(false);

		cbBurgerSingleChicken = new JCheckBox("Single Chicken", false);
		cbBurgerSingleChicken.setBounds(440, 145, 140, 30);
		cbBurgerSingleChicken.setVisible(false);

		cbBurgerDoubleChicken = new JCheckBox("Double Chicken", false);
		cbBurgerDoubleChicken.setBounds(440, 180, 140, 30);
		cbBurgerDoubleChicken.setVisible(false);

		buttonOrderBurger = new JButton();
		buttonOrderBurger.setBounds(440, 215, 140, 30);
		buttonOrderBurger.addActionListener(this);
		buttonOrderBurger.setText("ORDER BURGER");
		buttonOrderBurger.setFocusable(false);
		buttonOrderBurger.setVisible(false);

		buttonPizza = new JButton();
		buttonPizza.setBounds(295, 40, 140, 30);
		buttonPizza.addActionListener(this);
		buttonPizza.setText("PIZZA");
		buttonPizza.setFocusable(false);
		buttonPizza.setVisible(false);

		cbPizzaFlatBread = new JCheckBox("FLAT BREAD", true);
		cbPizzaFlatBread.setBounds(440, 40, 140, 30);
		cbPizzaFlatBread.setVisible(false);

		cbPizzaYeastedBread = new JCheckBox("YEASTED BREAD", false);
		cbPizzaYeastedBread.setBounds(440, 75, 140, 30);
		cbPizzaYeastedBread.setVisible(false);

		cbPizzaSmall = new JCheckBox("SMALL", false);
		cbPizzaSmall.setBounds(440, 110, 140, 30);
		cbPizzaSmall.setVisible(false);

		cbPizzaMedium = new JCheckBox("MEDIUM", true);
		cbPizzaMedium.setBounds(440, 145, 140, 30);
		cbPizzaMedium.setVisible(false);

		cbPizzaLarge = new JCheckBox("LARGE", false);
		cbPizzaLarge.setBounds(440, 180, 140, 30);
		cbPizzaLarge.setVisible(false);

		buttonOrderPizza = new JButton();
		buttonOrderPizza.setBounds(440, 215, 140, 30);
		buttonOrderPizza.addActionListener(this);
		buttonOrderPizza.setText("ORDER PIZZA");
		buttonOrderPizza.setFocusable(false);
		buttonOrderPizza.setVisible(false);

		buttonPasta = new JButton();
		buttonPasta.setBounds(295, 75, 140, 30);
		buttonPasta.addActionListener(this);
		buttonPasta.setText("PASTA");
		buttonPasta.setFocusable(false);
		buttonPasta.setVisible(false);

		cbPastaAlfredoSauce = new JCheckBox("ALFREDO", false);
		cbPastaAlfredoSauce.setBounds(440, 75, 140, 30);
		cbPastaAlfredoSauce.setVisible(false);

		cbPastaTomatoSauce = new JCheckBox("YEASTED BREAD", true);
		cbPastaTomatoSauce.setBounds(440, 110, 140, 30);
		cbPastaTomatoSauce.setVisible(false);

		cbPastaSpaghetti = new JCheckBox("SPAGHETTI", false);
		cbPastaSpaghetti.setBounds(440, 145, 140, 30);
		cbPastaSpaghetti.setVisible(false);

		cbPastaFarfalle = new JCheckBox("FARFALLE", true);
		cbPastaFarfalle.setBounds(440, 180, 140, 30);
		cbPastaFarfalle.setVisible(false);

		cbPastaFusilli = new JCheckBox("LARGE", false);
		cbPastaFusilli.setBounds(440, 215, 140, 30);
		cbPastaFusilli.setVisible(false);

		buttonOrderPasta = new JButton();
		buttonOrderPasta.setBounds(440, 250, 140, 30);
		buttonOrderPasta.addActionListener(this);
		buttonOrderPasta.setText("ORDER PASTA");
		buttonOrderPasta.setFocusable(false);
		buttonOrderPasta.setVisible(false);

		buttonBeer = new JButton();
		buttonBeer.setBounds(295, 5, 140, 30);
		buttonBeer.addActionListener(this);
		buttonBeer.setText("BEER");
		buttonBeer.setFocusable(false);
		buttonBeer.setVisible(false);

		cbTuborug = new JCheckBox("TUBORUG", true);
		cbTuborug.setBounds(440, 5, 140, 30);
		cbTuborug.setVisible(false);

		cbEfeys = new JCheckBox("EFEYS", false);
		cbEfeys.setBounds(440, 40, 140, 30);
		cbEfeys.setVisible(false);

		cbKarlsberg = new JCheckBox("KARLSBERG", false);
		cbKarlsberg.setBounds(440, 75, 140, 30);
		cbKarlsberg.setVisible(false);

		cbGlass = new JCheckBox("GLASS", true);
		cbGlass.setBounds(440, 110, 140, 30);
		cbGlass.setVisible(false);

		cbCan = new JCheckBox("CAN", false);
		cbCan.setBounds(440, 145, 140, 30);
		cbCan.setVisible(false);

		cb33Cl = new JCheckBox("33 cl", false);
		cb33Cl.setBounds(440, 180, 140, 30);
		cb33Cl.setVisible(false);

		cb50Cl = new JCheckBox("50 cl", true);
		cb50Cl.setBounds(440, 215, 140, 30);
		cb50Cl.setVisible(false);

		buttonOrderBeer = new JButton();
		buttonOrderBeer.setBounds(440, 250, 140, 30);
		buttonOrderBeer.addActionListener(this);
		buttonOrderBeer.setText("ORDER BEER");
		buttonOrderBeer.setFocusable(false);
		buttonOrderBeer.setVisible(false);

		buttonCocktail = new JButton();
		buttonCocktail.setBounds(295, 40, 140, 30);
		buttonCocktail.addActionListener(this);
		buttonCocktail.setText("COCKTAIL");
		buttonCocktail.setFocusable(false);
		buttonCocktail.setVisible(false);

		cbVodka = new JCheckBox("VODKA", false);
		cbVodka.setBounds(440, 40, 140, 30);
		cbVodka.setVisible(false);

		cbGin = new JCheckBox("GIN", false);
		cbGin.setBounds(440, 75, 140, 30);
		cbGin.setVisible(false);

		cbTequila = new JCheckBox("TEQUILA", false);
		cbTequila.setBounds(440, 110, 140, 30);
		cbTequila.setVisible(false);

		cbRom = new JCheckBox("ROM", false);
		cbRom.setBounds(440, 145, 140, 30);
		cbRom.setVisible(false);

		cbSoda = new JCheckBox("SODA", false);
		cbSoda.setBounds(440, 180, 140, 30);
		cbSoda.setVisible(false);

		cbLime = new JCheckBox("LIME", false);
		cbLime.setBounds(440, 215, 140, 30);
		cbLime.setVisible(false);

		cbSalt = new JCheckBox("SALT", false);
		cbSalt.setBounds(440, 250, 140, 30);
		cbSalt.setVisible(false);

		cbLongGlass = new JCheckBox("LONG GLASS", false);
		cbLongGlass.setBounds(440, 285, 140, 30);
		cbLongGlass.setVisible(false);

		cbShortGlass = new JCheckBox("SHORT GLASS", false);
		cbShortGlass.setBounds(440, 320, 140, 30);
		cbShortGlass.setVisible(false);

		buttonOrderCocktail = new JButton();
		buttonOrderCocktail.setBounds(440, 355, 140, 30);
		buttonOrderCocktail.addActionListener(this);
		buttonOrderCocktail.setText("ORDER COCKTAIL");
		buttonOrderCocktail.setFocusable(false);
		buttonOrderCocktail.setVisible(false);

		buttonWine = new JButton();
		buttonWine.setBounds(295, 75, 140, 30);
		buttonWine.addActionListener(this);
		buttonWine.setText("WINE");
		buttonWine.setFocusable(false);
		buttonWine.setVisible(false);

		cbDolucaRed = new JCheckBox("DOLUCA RED", false);
		cbDolucaRed.setBounds(440, 75, 140, 30);
		cbDolucaRed.setVisible(false);

		cbBuzbagRed = new JCheckBox("BUZBAG RED", false);
		cbBuzbagRed.setBounds(440, 110, 140, 30);
		cbBuzbagRed.setVisible(false);

		cbBuzbagRose = new JCheckBox("BUZBAG ROSE", false);
		cbBuzbagRose.setBounds(440, 145, 140, 30);
		cbBuzbagRose.setVisible(false);

		cbOneGlass = new JCheckBox("GLASS", false);
		cbOneGlass.setBounds(440, 180, 140, 30);
		cbOneGlass.setVisible(false);

		cbBottle = new JCheckBox("BOTTLE", false);
		cbBottle.setBounds(440, 215, 140, 30);
		cbBottle.setVisible(false);

		buttonOrderWine = new JButton();
		buttonOrderWine.setBounds(440, 250, 140, 30);
		buttonOrderWine.addActionListener(this);
		buttonOrderWine.setText("ORDER WINE");
		buttonOrderWine.setFocusable(false);
		buttonOrderWine.setVisible(false);

		this.setTitle("POS");
		this.setLayout(null);
		this.setSize(1080, 720);
		this.setResizable(false);
		this.getContentPane().setBackground(Color.DARK_GRAY);

		this.add(orderDisplay);
		this.add(buttonTable1);
		this.add(buttonTable2);
		this.add(buttonTable3);
		this.add(buttonTable4);
		this.add(buttonTable5);
		this.add(buttonTable6);
		this.add(buttonTable7);
		this.add(buttonTable8);
		this.add(buttonFoods);
		this.add(buttonDrinks);
		this.add(buttonCompleteOrder);
		this.add(buttonBurger);
		this.add(cbBurgerPlainBread);
		this.add(cbBurgerSesameBread);
		this.add(cbBurgerSingleBeef);
		this.add(cbBurgerDoubleBeef);
		this.add(cbBurgerSingleChicken);
		this.add(cbBurgerDoubleChicken);
		this.add(buttonOrderBurger);
		this.add(buttonPizza);
		this.add(cbPizzaFlatBread);
		this.add(cbPizzaYeastedBread);
		this.add(cbPizzaSmall);
		this.add(cbPizzaMedium);
		this.add(cbPizzaLarge);
		this.add(buttonOrderPizza);
		this.add(buttonPasta);
		this.add(cbPastaAlfredoSauce);
		this.add(cbPastaTomatoSauce);
		this.add(cbPastaFarfalle);
		this.add(cbPastaSpaghetti);
		this.add(cbPastaFusilli);
		this.add(buttonOrderPasta);
		this.add(buttonBeer);
		this.add(cbTuborug);
		this.add(cbEfeys);
		this.add(cbKarlsberg);
		this.add(cbGlass);
		this.add(cbCan);
		this.add(cb33Cl);
		this.add(cb50Cl);
		this.add(buttonOrderBeer);
		this.add(buttonCocktail);
		this.add(cbVodka);
		this.add(cbGin);
		this.add(cbTequila);
		this.add(cbRom);
		this.add(cbSoda);
		this.add(cbLime);
		this.add(cbSalt);
		this.add(cbLongGlass);
		this.add(cbShortGlass);
		this.add(buttonOrderCocktail);
		this.add(buttonWine);
		this.add(cbDolucaRed);
		this.add(cbBuzbagRed);
		this.add(cbBuzbagRose);
		this.add(cbOneGlass);
		this.add(cbBottle);
		this.add(buttonOrderWine);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonTable1) {
			buttonTable1.setEnabled(false);
			buttonTable2.setEnabled(true);
			buttonTable3.setEnabled(true);
			buttonTable4.setEnabled(true);
			buttonTable5.setEnabled(true);
			buttonTable6.setEnabled(true);
			buttonTable7.setEnabled(true);
			buttonTable8.setEnabled(true);
			buttonFoods.setVisible(true);
			buttonDrinks.setVisible(true);
			buttonCompleteOrder.setVisible(true);

		}
		if (e.getSource() == buttonTable2) {
			buttonTable1.setEnabled(true);
			buttonTable2.setEnabled(false);
			buttonTable3.setEnabled(true);
			buttonTable4.setEnabled(true);
			buttonTable5.setEnabled(true);
			buttonTable6.setEnabled(true);
			buttonTable7.setEnabled(true);
			buttonTable8.setEnabled(true);
			buttonFoods.setVisible(true);
			buttonDrinks.setVisible(true);
			buttonCompleteOrder.setVisible(true);

		}
		if (e.getSource() == buttonTable3) {
			buttonTable1.setEnabled(true);
			buttonTable2.setEnabled(true);
			buttonTable3.setEnabled(false);
			buttonTable4.setEnabled(true);
			buttonTable5.setEnabled(true);
			buttonTable6.setEnabled(true);
			buttonTable7.setEnabled(true);
			buttonTable8.setEnabled(true);
			buttonFoods.setVisible(true);
			buttonDrinks.setVisible(true);
			buttonCompleteOrder.setVisible(true);

		}
		if (e.getSource() == buttonTable4) {
			buttonTable1.setEnabled(true);
			buttonTable2.setEnabled(true);
			buttonTable3.setEnabled(true);
			buttonTable4.setEnabled(false);
			buttonTable5.setEnabled(true);
			buttonTable6.setEnabled(true);
			buttonTable7.setEnabled(true);
			buttonTable8.setEnabled(true);
			buttonFoods.setVisible(true);
			buttonDrinks.setVisible(true);
			buttonCompleteOrder.setVisible(true);

		}
		if (e.getSource() == buttonTable5) {
			buttonTable1.setEnabled(true);
			buttonTable2.setEnabled(true);
			buttonTable3.setEnabled(true);
			buttonTable4.setEnabled(true);
			buttonTable5.setEnabled(false);
			buttonTable6.setEnabled(true);
			buttonTable7.setEnabled(true);
			buttonTable8.setEnabled(true);
			buttonFoods.setVisible(true);
			buttonDrinks.setVisible(true);
			buttonCompleteOrder.setVisible(true);

		}
		if (e.getSource() == buttonTable6) {
			buttonTable1.setEnabled(true);
			buttonTable2.setEnabled(true);
			buttonTable3.setEnabled(true);
			buttonTable4.setEnabled(true);
			buttonTable5.setEnabled(true);
			buttonTable6.setEnabled(false);
			buttonTable7.setEnabled(true);
			buttonTable8.setEnabled(true);
			buttonFoods.setVisible(true);
			buttonDrinks.setVisible(true);
			buttonCompleteOrder.setVisible(true);

		}
		if (e.getSource() == buttonTable7) {
			buttonTable1.setEnabled(true);
			buttonTable2.setEnabled(true);
			buttonTable3.setEnabled(true);
			buttonTable4.setEnabled(true);
			buttonTable5.setEnabled(true);
			buttonTable6.setEnabled(true);
			buttonTable7.setEnabled(false);
			buttonTable8.setEnabled(true);
			buttonFoods.setVisible(true);
			buttonDrinks.setVisible(true);
			buttonCompleteOrder.setVisible(true);

		}
		if (e.getSource() == buttonTable8) {
			buttonTable1.setEnabled(true);
			buttonTable2.setEnabled(true);
			buttonTable3.setEnabled(true);
			buttonTable4.setEnabled(true);
			buttonTable5.setEnabled(true);
			buttonTable6.setEnabled(true);
			buttonTable7.setEnabled(true);
			buttonTable8.setEnabled(false);
			buttonFoods.setVisible(true);
			buttonDrinks.setVisible(true);
			buttonCompleteOrder.setVisible(true);

		}

		if (e.getSource() == buttonCompleteOrder) {
			// write to the text field total price
			buttonTable1.setEnabled(true);
			buttonTable2.setEnabled(true);
			buttonTable3.setEnabled(true);
			buttonTable4.setEnabled(true);
			buttonTable5.setEnabled(true);
			buttonTable6.setEnabled(true);
			buttonTable7.setEnabled(true);
			buttonTable8.setEnabled(true);
			buttonFoods.setVisible(false);
			buttonDrinks.setVisible(false);
			buttonCompleteOrder.setVisible(false);
			buttonBurger.setVisible(false);
			cbBurgerPlainBread.setVisible(false);
			cbBurgerSesameBread.setVisible(false);
			cbBurgerSingleBeef.setVisible(false);
			cbBurgerDoubleBeef.setVisible(false);
			cbBurgerSingleChicken.setVisible(false);
			cbBurgerDoubleChicken.setVisible(false);
			buttonOrderBurger.setVisible(false);

			buttonPizza.setVisible(false);
			cbPizzaFlatBread.setVisible(false);
			cbPizzaYeastedBread.setVisible(false);
			cbPizzaSmall.setVisible(false);
			cbPizzaMedium.setVisible(false);
			cbPizzaLarge.setVisible(false);
			buttonOrderPizza.setVisible(false);

			buttonPasta.setVisible(false);
			cbPastaAlfredoSauce.setVisible(false);
			cbPastaTomatoSauce.setVisible(false);
			cbPastaFarfalle.setVisible(false);
			cbPastaFusilli.setVisible(false);
			cbPastaSpaghetti.setVisible(false);
			buttonOrderPasta.setVisible(false);

			buttonBeer.setVisible(false);
			buttonCocktail.setVisible(false);
			buttonWine.setVisible(false);

			cbVodka.setVisible(false);
			cbGin.setVisible(false);
			cbTequila.setVisible(false);
			cbRom.setVisible(false);
			cbSoda.setVisible(false);
			cbLime.setVisible(false);
			cbSalt.setVisible(false);
			cbLongGlass.setVisible(false);
			cbShortGlass.setVisible(false);
			buttonOrderCocktail.setVisible(false);
			cbTuborug.setVisible(false);
			cbEfeys.setVisible(false);
			cbKarlsberg.setVisible(false);
			cbGlass.setVisible(false);
			cbCan.setVisible(false);
			cb33Cl.setVisible(false);
			cb50Cl.setVisible(false);
			buttonOrderBeer.setVisible(false);
			cbDolucaRed.setVisible(false);
			cbBuzbagRed.setVisible(false);
			cbBuzbagRose.setVisible(false);
			cbOneGlass.setVisible(false);
			cbBottle.setVisible(false);
			buttonOrderWine.setVisible(false);

		}
		if (e.getSource() == buttonFoods) {
			buttonBurger.setVisible(true);
			buttonPizza.setVisible(true);
			buttonPasta.setVisible(true);
			buttonBeer.setVisible(false);
			buttonCocktail.setVisible(false);
			buttonWine.setVisible(false);
		}

		if (e.getSource() == buttonBurger) {
			cbBurgerPlainBread.setVisible(true);
			cbBurgerSesameBread.setVisible(true);
			cbBurgerSingleBeef.setVisible(true);
			cbBurgerDoubleBeef.setVisible(true);
			cbBurgerSingleChicken.setVisible(true);
			cbBurgerDoubleChicken.setVisible(true);
			buttonOrderBurger.setVisible(true);
			//
			cbPizzaFlatBread.setVisible(false);
			cbPizzaYeastedBread.setVisible(false);
			cbPizzaSmall.setVisible(false);
			cbPizzaMedium.setVisible(false);
			cbPizzaLarge.setVisible(false);
			buttonOrderPizza.setVisible(false);
			cbPastaAlfredoSauce.setVisible(false);
			cbPastaTomatoSauce.setVisible(false);
			cbPastaFarfalle.setVisible(false);
			cbPastaFusilli.setVisible(false);
			cbPastaSpaghetti.setVisible(false);
			buttonOrderPasta.setVisible(false);
		}

		if (e.getSource() == buttonOrderBurger) {
			// Create an object for the selected table queue and insert it
			// write the operatiion to the text field
			cbBurgerPlainBread.setVisible(false);
			cbBurgerSesameBread.setVisible(false);
			cbBurgerSingleBeef.setVisible(false);
			cbBurgerDoubleBeef.setVisible(false);
			cbBurgerSingleChicken.setVisible(false);
			cbBurgerDoubleChicken.setVisible(false);
			buttonOrderBurger.setVisible(false);
			buttonBurger.setVisible(false);
			buttonPizza.setVisible(false);
			buttonPasta.setVisible(false);
		}

		if (e.getSource() == buttonPizza) {
			cbPizzaFlatBread.setVisible(true);
			cbPizzaYeastedBread.setVisible(true);
			cbPizzaSmall.setVisible(true);
			cbPizzaMedium.setVisible(true);
			cbPizzaLarge.setVisible(true);
			buttonOrderPizza.setVisible(true);
			//
			cbBurgerPlainBread.setVisible(false);
			cbBurgerSesameBread.setVisible(false);
			cbBurgerSingleBeef.setVisible(false);
			cbBurgerDoubleBeef.setVisible(false);
			cbBurgerSingleChicken.setVisible(false);
			cbBurgerDoubleChicken.setVisible(false);
			buttonOrderBurger.setVisible(false);
			cbPastaAlfredoSauce.setVisible(false);
			cbPastaTomatoSauce.setVisible(false);
			cbPastaFarfalle.setVisible(false);
			cbPastaFusilli.setVisible(false);
			cbPastaSpaghetti.setVisible(false);
			buttonOrderPasta.setVisible(false);
		}

		if (e.getSource() == buttonOrderPizza) {
			// Create an object for the selected table queue and insert it
			// write the operatiion to the text field
			cbPizzaFlatBread.setVisible(false);
			cbPizzaYeastedBread.setVisible(false);
			cbPizzaSmall.setVisible(false);
			cbPizzaMedium.setVisible(false);
			cbPizzaLarge.setVisible(false);
			buttonOrderPizza.setVisible(false);
			buttonPizza.setVisible(false);
			buttonBurger.setVisible(false);
			buttonPasta.setVisible(false);
		}

		if (e.getSource() == buttonPasta) {
			cbPastaAlfredoSauce.setVisible(true);
			cbPastaTomatoSauce.setVisible(true);
			cbPastaFarfalle.setVisible(true);
			cbPastaFusilli.setVisible(true);
			cbPastaSpaghetti.setVisible(true);
			buttonOrderPasta.setVisible(true);
			//
			cbPizzaFlatBread.setVisible(false);
			cbPizzaYeastedBread.setVisible(false);
			cbPizzaSmall.setVisible(false);
			cbPizzaMedium.setVisible(false);
			cbPizzaLarge.setVisible(false);
			buttonOrderPizza.setVisible(false);
			cbBurgerPlainBread.setVisible(false);
			cbBurgerSesameBread.setVisible(false);
			cbBurgerSingleBeef.setVisible(false);
			cbBurgerDoubleBeef.setVisible(false);
			cbBurgerSingleChicken.setVisible(false);
			cbBurgerDoubleChicken.setVisible(false);
			buttonOrderBurger.setVisible(false);
		}

		if (e.getSource() == buttonOrderPasta) {
			// Create an object for the selected table queue and insert it
			// write the operatiion to the text field
			cbPastaAlfredoSauce.setVisible(false);
			cbPastaTomatoSauce.setVisible(false);
			cbPastaFarfalle.setVisible(false);
			cbPastaFusilli.setVisible(false);
			cbPastaSpaghetti.setVisible(false);
			buttonOrderPasta.setVisible(false);
			buttonBurger.setVisible(false);
			buttonPizza.setVisible(false);
			buttonPasta.setVisible(false);
		}

		if (e.getSource() == buttonDrinks) {
			buttonBeer.setVisible(true);
			buttonCocktail.setVisible(true);
			buttonWine.setVisible(true);
			buttonBurger.setVisible(false);
			buttonPizza.setVisible(false);
			buttonPasta.setVisible(false);
		}
		if (e.getSource() == buttonBeer) {
			cbTuborug.setVisible(true);
			cbEfeys.setVisible(true);
			cbKarlsberg.setVisible(true);
			cbGlass.setVisible(true);
			cbCan.setVisible(true);
			cb33Cl.setVisible(true);
			cb50Cl.setVisible(true);
			buttonOrderBeer.setVisible(true);
			cbVodka.setVisible(false);
			cbGin.setVisible(false);
			cbTequila.setVisible(false);
			cbRom.setVisible(false);
			cbSoda.setVisible(false);
			cbLime.setVisible(false);
			cbSalt.setVisible(false);
			cbLongGlass.setVisible(false);
			cbShortGlass.setVisible(false);
			buttonOrderCocktail.setVisible(false);
			cbDolucaRed.setVisible(false);
			cbBuzbagRed.setVisible(false);
			cbBuzbagRose.setVisible(false);
			cbOneGlass.setVisible(false);
			cbBottle.setVisible(false);
			buttonOrderWine.setVisible(false);
		}
		if (e.getSource() == buttonOrderBeer) {
			// Create an object for the selected table queue and insert it
			// write the operatiion to the text field
			cbTuborug.setVisible(false);
			cbEfeys.setVisible(false);
			cbKarlsberg.setVisible(false);
			cbGlass.setVisible(false);
			cbCan.setVisible(false);
			cb33Cl.setVisible(false);
			cb50Cl.setVisible(false);
			buttonOrderBeer.setVisible(false);
		}
		if (e.getSource() == buttonCocktail) {
			cbVodka.setVisible(true);
			cbGin.setVisible(true);
			cbTequila.setVisible(true);
			cbRom.setVisible(true);
			cbSoda.setVisible(true);
			cbLime.setVisible(true);
			cbSalt.setVisible(true);
			cbLongGlass.setVisible(true);
			cbShortGlass.setVisible(true);
			buttonOrderCocktail.setVisible(true);
			cbTuborug.setVisible(false);
			cbEfeys.setVisible(false);
			cbKarlsberg.setVisible(false);
			cbGlass.setVisible(false);
			cbCan.setVisible(false);
			cb33Cl.setVisible(false);
			cb50Cl.setVisible(false);
			buttonOrderBeer.setVisible(false);
			cbDolucaRed.setVisible(false);
			cbBuzbagRed.setVisible(false);
			cbBuzbagRose.setVisible(false);
			cbOneGlass.setVisible(false);
			cbBottle.setVisible(false);
			buttonOrderWine.setVisible(false);
		}
		if (e.getSource() == buttonOrderCocktail) {
			// Create an object for the selected table queue and insert it
			// write the operatiion to the text field
			cbVodka.setVisible(false);
			cbGin.setVisible(false);
			cbTequila.setVisible(false);
			cbRom.setVisible(false);
			cbSoda.setVisible(false);
			cbLime.setVisible(false);
			cbSalt.setVisible(false);
			cbLongGlass.setVisible(false);
			cbShortGlass.setVisible(false);
			buttonOrderCocktail.setVisible(false);

		}
		if (e.getSource() == buttonWine) {
			cbDolucaRed.setVisible(true);
			cbBuzbagRed.setVisible(true);
			cbBuzbagRose.setVisible(true);
			cbOneGlass.setVisible(true);
			cbBottle.setVisible(true);
			buttonOrderWine.setVisible(true);
			cbTuborug.setVisible(false);
			cbEfeys.setVisible(false);
			cbKarlsberg.setVisible(false);
			cbGlass.setVisible(false);
			cbCan.setVisible(false);
			cb33Cl.setVisible(false);
			cb50Cl.setVisible(false);
			buttonOrderBeer.setVisible(false);
			cbVodka.setVisible(false);
			cbGin.setVisible(false);
			cbTequila.setVisible(false);
			cbRom.setVisible(false);
			cbSoda.setVisible(false);
			cbLime.setVisible(false);
			cbSalt.setVisible(false);
			cbLongGlass.setVisible(false);
			cbShortGlass.setVisible(false);
			buttonOrderCocktail.setVisible(false);

		}
		if (e.getSource() == buttonOrderWine) {
			cbDolucaRed.setVisible(false);
			cbBuzbagRed.setVisible(false);
			cbBuzbagRose.setVisible(false);
			cbOneGlass.setVisible(false);
			cbBottle.setVisible(false);
			buttonOrderWine.setVisible(false);
			cbKarlsberg.isEnabled();
			buttonTable8.isEnabled();
		}

	}
}