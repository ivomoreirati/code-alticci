package org.winprovit.data.usecases;

import org.winprovit.domain.usecases.GetSequence;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class GetSequenceImpl implements GetSequence {

    public GetSequenceImpl() {

    }

    private static final Map <BigInteger, BigInteger> cache = new HashMap<>();

    @Override
    public BigInteger getSequenceAlticci(BigInteger n) {
        if (cache.get(n) != null ){
            return cache.get(n);
        }
        if (BigInteger.ZERO.equals(n)) {
            return BigInteger.ZERO;
        } else if (BigInteger.ONE.equals(n) || BigInteger.TWO.equals(n)) {
            return BigInteger.ONE;
        }

        BigInteger result = getSequenceAlticci(n.subtract(new BigInteger("3")))
                            .add(getSequenceAlticci(n.subtract(new BigInteger("2"))));
        cache.put(n, result);
        return result;
    }
}
