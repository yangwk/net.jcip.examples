package net.jcip.examples.Structuring_Concurrent_Applications.Applying_Thread_Pools.great;

import java.util.*;

/**
 * Puzzle
 * <p/>
 * Abstraction for puzzles like the 'sliding blocks puzzle'
 *
 * @author Brian Goetz and Tim Peierls
 */
public interface Puzzle <P, M> {
    P initialPosition();

    boolean isGoal(P position);

    Set<M> legalMoves(P position);

    P move(P position, M move);
}
