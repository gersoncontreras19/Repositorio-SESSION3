package com.example.session1semana2.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "facturas")
@Getter
@Setter
public class Facturas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Integer id_factura;

    @Column(name = "id_pedido")
    private Integer id_pedido;

    @Column(name = "fecha_factura")
    private LocalDate fecha_factura;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "impuesto")
    private BigDecimal impuesto;

    @Column(name = "subtotal")
    private BigDecimal subtotal;

    @Column(name = "metodo_pago")
    private String metodo_pago;

    @Column(name = "estado")
    private String estado;

    @Column(name = "fecha_vencimiento")
    private LocalDate fecha_vencimiento;

    @Column(name = "fecha_pago")
    private LocalDate fecha_pago;

    @Column(name = "numero_factura")
    private String numero_factura;

    @Column(name = "tipo_documento")
    private String tipo_documento;

    @Column(name = "serie")
    private String serie;

    @Column(name = "moneda")
    private String moneda;

    @Column(name = "comentarios")
    private String comentarios;

    // Constructor vacío necesario para JPA
    public Facturas() {
    }

    // Constructor con parámetros opcional
    public Facturas(Integer id_factura, Integer id_pedido, LocalDate fecha_factura, BigDecimal total,
                    BigDecimal impuesto, BigDecimal subtotal, String metodo_pago, String estado,
                    LocalDate fecha_vencimiento, LocalDate fecha_pago, String numero_factura,
                    String tipo_documento, String serie, String moneda, String comentarios) {
        this.id_factura = id_factura;
        this.id_pedido = id_pedido;
        this.fecha_factura = fecha_factura;
        this.total = total;
        this.impuesto = impuesto;
        this.subtotal = subtotal;
        this.metodo_pago = metodo_pago;
        this.estado = estado;
        this.fecha_vencimiento = fecha_vencimiento;
        this.fecha_pago = fecha_pago;
        this.numero_factura = numero_factura;
        this.tipo_documento = tipo_documento;
        this.serie = serie;
        this.moneda = moneda;
        this.comentarios = comentarios;
    }
}
