package com.luazevedodeveloper.spring.entities;

/*
Vantagens de Usar Enums:
Enum é uma constante
Legibilidade: Código mais claro e legível.
Manutenibilidade: Facilita a manutenção e atualização do código.
Segurança: Reduz a chance de erros, pois só permite valores definidos.
Enums são uma ferramenta poderosa no Java para representar um conjunto fixo de constantes de uma maneira segura e legível.
*/

public enum StatusDoPedido {
    AGUARDANDO_PAGAMENTO(1),
    PAGO(2),
    ENVIADO(3),
    ENTREGUE(4),
    CANCELADO(5);

    private final int code;

    private StatusDoPedido(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static StatusDoPedido valueOf(int code) {
        for (StatusDoPedido value : StatusDoPedido.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Code inválido do Status do Pedido");
    }
}

