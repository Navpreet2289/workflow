package org.neuro4j.workflow.demo.lesson4;

import java.util.HashMap;
import java.util.Map;

import org.neuro4j.core.Connected;
import org.neuro4j.logic.LogicContext;
import org.neuro4j.logic.swf.FlowExecutionException;
import org.neuro4j.logic.swf.SimpleWorkflowEngine;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Map<String, Object> params = new HashMap<String, Object>();
			
			LogicContext logicContext = SimpleWorkflowEngine.run("org.neuro4j.workflow.demo.lesson4.Call-Start", params);
			
			Connected lastValue = (Connected) logicContext.get("CURRENT_NODE");
			
			System.out.println(lastValue.getName());

		} catch (FlowExecutionException e) {
			e.printStackTrace();
		}

	}
	


	
}