package model.Expression;

import java.util.HashMap;
import java.util.Map;

import model.Command.Command;

public class ExpressionFactory {

	protected Map<String, BinaryExpressionCreator> map = new HashMap<>();
	
	public static interface BinaryExpressionCreator {
		public BinaryExpression create(Expression left, Expression right);
	}

	public ExpressionFactory() {
		map.put("Plus", Plus::new);
		map.put("Minus", Minus::new);
		map.put("Mul", Mul::new);
		map.put("Div", Div::new);
	}
	
	public boolean isExpressionExists(String name) {
		return map.containsKey(name);
	}
	
	public BinaryExpression getExpression(String name, Command left, Command right) throws NumberFormatException, NullPointerException, Exception {
		// We assume left & right is command returning double.
		//Expression l = new Number(left.execute().asDouble());
		//Expression r = new Number(right.execute().asDouble());
		//return map.get(name).create(l, r); // map.get(name).create(left, right);
		return null;
	}

}
