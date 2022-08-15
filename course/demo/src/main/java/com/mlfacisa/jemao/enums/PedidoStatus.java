package com.mlfacisa.jemao.enums;

public enum PedidoStatus {
	
	ENVIADO(1),
	NÂO_ENVIADO(2);
	
	
	private int codigo;
	
	public int getCodigo() {
		return codigo;
	}
	
	private PedidoStatus (int codigo) {
		this.codigo = codigo;
	}
	
	public static PedidoStatus valueOf(int codigo) {
        for (PedidoStatus pedidoStatus: PedidoStatus.values()) {
            if (pedidoStatus.getCodigo() == codigo) {
                return pedidoStatus;
            }
        }
		return null;
	}
}
