package com.luazevedodeveloper.spring.config;

import com.luazevedodeveloper.spring.entities.Pedido;
import com.luazevedodeveloper.spring.entities.StatusDoPedido;
import com.luazevedodeveloper.spring.entities.Usuario;
import com.luazevedodeveloper.spring.repositories.PedidoRepository;
import com.luazevedodeveloper.spring.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public void run(String... args) throws Exception {

        Usuario user1 = new Usuario(null, "Marcia Santos", "marcia@gmail.com", "3451-2514", "45@2587");
        Usuario user2 = new Usuario(null, "Lucca Matos", "lucca@gmail.com", "98262-5874", "987*254");
        Usuario user3 = new Usuario(null, "Larissa Gonçalves", "larissa@gmail.com", "2978-4578", "258-55*");
        Usuario user4 = new Usuario(null, "Marcia Santos", "marcia@gmail.com", "3451-2514", "45@2587");
        Usuario user5 = new Usuario(null, "Marcelo Azevedo", "marcelo@gmail.com", "99650-9879", "288***@");

        // Criação dos pedidos com datas usando Date
        Pedido pedido001 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), StatusDoPedido.PAGO, user1);   // formato ISO8601
        Pedido pedido002 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), StatusDoPedido.AGUARDANDO_PAGAMENTO, user2);
        Pedido pedido003 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), StatusDoPedido.ENTREGUE, user3);
        Pedido pedido004 = new Pedido(null, Instant.parse("2019-08-16T11:49:09Z"), StatusDoPedido.ENVIADO, user1);
        Pedido pedido005 = new Pedido(null, Instant.parse("2019-09-12T07:25:11Z"), StatusDoPedido.CANCELADO, user3);

        usuarioRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5));
        pedidoRepository.saveAll(Arrays.asList(pedido001, pedido002, pedido003, pedido004, pedido005));
    }

}





