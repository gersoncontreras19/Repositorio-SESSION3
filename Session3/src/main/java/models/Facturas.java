package com.example.facturasapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "facturas")
@Data
public class FACTURAS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}

