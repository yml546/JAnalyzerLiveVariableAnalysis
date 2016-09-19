package graph.cfg.creator;

import graph.cfg.ControlFlowGraph;

import java.util.List;

import org.eclipse.jdt.core.dom.Statement;

/**
 * The interface for CFG creator of statements.
 * @author Zhou Xiaocong
 * @since 2012/12/28
 * @version 1.0
 *
 */
public interface StatementCFGCreator {
	/**
	 * All statement CFG creator must implement this method to generate CFG for each statement.
	 * IMPORTANT NOTE: The implementation of all statement CFG creator have to only depend on the parameters and 
	 * local variable of this method, that is, its implementation DO NOT depend the state of the object, because 
	 * the object by be reused to generate CFG for many statements which have the same type. 
	 * 
	 * @param currentCFG : Create CFG for the currentCFG
	 * @param astNode : Create CFG for the current statement astNode
	 * @param precedeNodeList : The possible precede nodes for the CFG nodes generated by this statement
	 * @return The possible precede nodes for the CFG nodes of the succeed statements
	 */
	public List<PossiblePrecedeNode> create(ControlFlowGraph currentCFG, 
			Statement astNode, List<PossiblePrecedeNode> precedeNodeList);
}