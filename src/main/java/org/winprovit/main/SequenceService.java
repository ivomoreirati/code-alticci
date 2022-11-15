package org.winprovit.main;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.winprovit.data.usecases.GetSequenceImpl;
import org.winprovit.domain.usecases.GetSequence;

import javax.enterprise.context.ApplicationScoped;
import java.math.BigInteger;

@ApplicationScoped
@RestClient
public class SequenceService {

    GetSequence getSequence;

    public SequenceService() {
        this.getSequence = new GetSequenceImpl();
    }

    public BigInteger getSequenceAlticci(BigInteger n) {
        if(n == null){
            return BigInteger.ZERO;
        }
        return this.getSequence.getSequenceAlticci(n);
    }
}