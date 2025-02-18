package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.Arrays;

/**
 * @author TheElk801
 */
public final class GolemXXToken extends TokenImpl {

    public GolemXXToken(int xValue) {
        super("Golem Token", "X/X colorless Golem artifact creature token");
        cardType.add(CardType.ARTIFACT);
        cardType.add(CardType.CREATURE);
        subtype.add(SubType.GOLEM);
        power = new MageInt(xValue);
        toughness = new MageInt(xValue);

        availableImageSetCodes = Arrays.asList("BRO");
    }

    public GolemXXToken(final GolemXXToken token) {
        super(token);
    }

    public GolemXXToken copy() {
        return new GolemXXToken(this);
    }
}
