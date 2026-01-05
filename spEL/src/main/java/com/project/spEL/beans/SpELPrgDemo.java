package com.project.spEL.beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.project.spEL")
public class SpELPrgDemo {
	
	public void runExpression() {
		
		ExpressionParser parser=new SpelExpressionParser();
		Expression exp=parser.parseExpression("10+20");
		System.out.println(exp.getValue());
		
		exp=parser.parseExpression("'Hello'.length()");
		System.out.println(exp.getValue());
		
		int num=20;
		StandardEvaluationContext ctx=new StandardEvaluationContext();
		ctx.setVariable("n",num);
		
		exp=parser.parseExpression("#n % 2==0?'even':'odd'");
		System.out.println(exp.getValue(ctx));
	}

}
