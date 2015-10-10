package grupp1.othello.model;

/*------------------------------------------------
 * IMPORTS
 *----------------------------------------------*/

import grupp1.othello.model.PlayerType;

import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

/*------------------------------------------------
 * CLASS
 *----------------------------------------------*/

/**
 * Contains information about the game configuration.
 *
 * @author Philip Arvidsson (S133686)
 */
public class GameConfiguration {

/*------------------------------------------------
 * FIELDS
 *----------------------------------------------*/

/**
 * First player's name property.
 */
private final StringProperty player1NameProperty = new SimpleStringProperty();

/**
 * First player's type.
 */
private PlayerType player1Type = PlayerType.HUMAN;

/**
 * Second player's name property.
 */
private final StringProperty player2NameProperty = new SimpleStringProperty();

/**
 * Second player's type.
 */
private PlayerType player2Type = PlayerType.COMPUTER;

/*------------------------------------------------
 * PUBLIC METHODS
 *----------------------------------------------*/

/**
 * Gets the first player's name property.
 *
 * @return The first player's name property.
 */
public final StringProperty player1NameProperty() {
    return (player1NameProperty);
}

/**
 * Gets the second player's name property.
 *
 * @return The second player's name property.
 */
public final StringProperty player2NameProperty() {
    return (player2NameProperty);
}

/**
 * Gets the first player's name.
 *
 * @return The first player's name.
 */
public String getPlayer1Name() {
    return (player1NameProperty.getValue());
}

/**
 * Sets the first player's name.
 *
 * @param value Player name.
 */
public void setPlayer1Name(String value) {
    player1NameProperty.setValue(value);
}

/**
 * Gets the first player's type.
 *
 * @return The first player's type.
 */
public PlayerType getPlayer1Type() {
    return (player1Type);
}

/**
 * Sets the first player's type.
 *
 * @param value Player type.
 */
public void setPlayer1Type(PlayerType value) {
    player1Type = value;
}

/**
 * Gets the second player's name.
 *
 * @return The second player's name.
 */
public String getPlayer2Name() {
    return (player2NameProperty.getValue());
}

/**
 * Sets the second player's name.
 *
 * @param value Player name.
 */
public void setPlayer2Name(String value) {
    player2NameProperty.setValue(value);
}

/**
 * Gets the first player's type.
 *
 * @return The first player's type.
 */
public PlayerType getPlayer2Type() {
    return (player2Type);
}

/**
 * Sets the first player's type.
 *
 * @param value Player type.
 */
public void setPlayer2Type(PlayerType value) {
    player2Type = value;
}

}
