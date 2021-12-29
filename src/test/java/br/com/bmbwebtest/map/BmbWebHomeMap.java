package br.com.bmbwebtest.map;

import br.com.bmbwebtest.utils.PageObjectUtils;

public class BmbWebHomeMap extends PageObjectUtils {
	
	protected String inputLogin="#login";
	protected String inputSenha="#password";
	protected String btEntrar=".send";
	
	
	protected String BtHoverAccount = "aside.row>div>div:nth-child(2)>div:nth-child(9)>img";
	protected String BtHoverSair = "div.modal-container-user-acount ul>li:nth-child(4)>a";
	
}
