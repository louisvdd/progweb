package com.spring.henallux.dataAccess.entity;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="promotion")
public class PromotionEntity 
{
	@Id
<<<<<<< HEAD
=======
	@NotNull
	@Min(1)
	@Max(1000)
>>>>>>> branch 'master' of https://github.com/louisvdd/progweb.git
	@Column(name="idpromotion")
	private int idPromotion;
	
<<<<<<< HEAD
=======
	@NotNull
	@DecimalMin("0.00")
	@DecimalMax("100.00")
>>>>>>> branch 'master' of https://github.com/louisvdd/progweb.git
	@Column(name="amountpourc")
	private double amountPourc;
	
<<<<<<< HEAD
=======
	@NotNull
	@Past
>>>>>>> branch 'master' of https://github.com/louisvdd/progweb.git
	@Column(name="datebegin")
	private Date dateBegin;
	
<<<<<<< HEAD
=======
	@NotNull
	@Future
>>>>>>> branch 'master' of https://github.com/louisvdd/progweb.git
	@Column(name="dateend")
	private Date dateEnd;

	public int getIdPromotion() 
	{
		return idPromotion;
	}

	public void setIdPromotion(int idPromotion) 
	{
		this.idPromotion = idPromotion;
	}

	public double getAmountPourc() 
	{
		return amountPourc;
	}

	public void setAmountPourc(double amountPourc) 
	{
		this.amountPourc = amountPourc;
	}

	public Date getDateBegin() 
	{
		return dateBegin;
	}

	public void setDateBegin(Date dateBegin) 
	{
		this.dateBegin = dateBegin;
	}

	public Date getDateEnd() 
	{
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) 
	{
		this.dateEnd = dateEnd;
	}	
}

