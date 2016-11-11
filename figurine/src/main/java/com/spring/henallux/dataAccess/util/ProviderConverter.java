package com.spring.henallux.dataAccess.util;

import org.springframework.stereotype.Component;
import com.spring.henallux.dataAccess.entity.*;
import com.spring.henallux.model.*;

@Component
public class ProviderConverter 
{
	//USER =====================================================
	public UserEntity userModeltoUserEntity(User user)
	{
		UserEntity userEntity = new UserEntity();
		userEntity.setIdUser(user.getIdUser());
		userEntity.setFirstName(user.getFirstName());
		userEntity.setLastName(user.getLastName());
		userEntity.setEmail(user.getEmail());
		userEntity.setNumTel(user.getNumTel());
		userEntity.setNumFax(user.getNumFax());
		userEntity.setStreet(user.getStreet());
		userEntity.setCity(user.getCity());
		userEntity.setPostalCode(user.getPostalCode());
		userEntity.setCountry(user.getCountry());
		userEntity.setPassword(user.getPassword());
		userEntity.setCommand(user.getCommand());
		
		return userEntity;
	}
	
	public User userEntitytoUserModel(UserEntity userEntity)
	{
		User user = new User();
		user.setIdUser(userEntity.getIdUser());
		user.setFirstName(userEntity.getFirstName());
		user.setLastName(userEntity.getLastName());
		user.setEmail(userEntity.getEmail());
		user.setNumTel(userEntity.getNumTel());
		user.setNumFax(userEntity.getNumFax());
		user.setStreet(userEntity.getStreet());
		user.setCity(userEntity.getCity());
		user.setPostalCode(userEntity.getPostalCode());
		user.setCountry(userEntity.getCountry());
		user.setPassword(userEntity.getPassword());
		user.setCommand(userEntity.getCommand());
		
		return user;
	}
	
	//TRANSLATIONFIGURINE =====================================================
	public TranslationFigurineEntity translationFigurineModeltoTranslationFigurineEntity(TranslationFigurine translationFigurine)
	{
		TranslationFigurineEntity translationFigurineEntity = new TranslationFigurineEntity();
		translationFigurineEntity.setNameIdUser(translationFigurine.getName());
		translationFigurineEntity.setDescription(translationFigurine.getDescription());
		
		return translationFigurineEntity;
	}
	
	public TranslationFigurine translationFigurineEntitytoTranslationFigurineModel(TranslationFigurineEntity translationFigurineEntity)
	{
		TranslationFigurine translationFigurine = new TranslationFigurine();
		translationFigurine.setNameIdUser(translationFigurineEntity.getName());
		translationFigurine.setDescription(translationFigurineEntity.getDescription());
		
		return translationFigurine;
	}
	
	//TRANSLATIONCATEGORY =====================================================
	public TranslationCategoryEntity translationCategoryModeltoTranslationCategoryEntity(TranslationFigurine translationCategory)
	{
		TranslationCategoryEntity translationCategoryEntity = new TranslationCategoryEntity();
		translationCategoryEntity.setName(translationCategory.getName());
		
		return translationCategoryEntity;
	}
	
	public TranslationCategory translationCategoryEntitytoTranslationCategoryModel(TranslationFigurineEntity translationCategoryEntity)
	{
		TranslationCategory translationCategory = new TranslationCategory();
		translationCategory.setName(translationCategoryEntity.getName());
		
		return translationCategory;
	}
	
	//PROMOTION =================================================================
	public PromotionEntity promotionModeltoPromotionEntity(Promotion promotion)
	{
		PromotionEntity promotionEntity = new PromotionEntity();
		promotionEntity.setIdPromotion(promotion.getIdPromotion());
		promotionEntity.setamountPourc(promotion.getAmountPourc());
		promotionEntity.setDateBegin(promotion.getDateBegin());
		promotionEntity.setDateEnd(promotion.getDateEnd());
		
		return promotionEntity;
	}
	
	public Promotion promotionEntitytoPromotionModel(PromotionEntity promotionEntity)
	{
		Promotion promotion = new Promotion();
		promotion.setIdPromotion(promotionEntity.getIdPromotion());
		promotion.setamountPourc(promotionEntity.getAmountPourc());
		promotion.setDateBegin(promotionEntity.getDateBegin());
		promotion.setDateEnd(promotionEntity.getDateEnd());
		
		return promotion;
	}
	
	//LANGUAGE ========================================================================
	public LanguageEntity languageCategoryModeltoLanguageEntity(Language language)
	{
		LanguageEntity languageEntity = new LanguageEntity();
		languageEntity.setFirstName(language.getIdLanguage());
		languageEntity.setFirstName(language.getName());
		
		return languageEntity;
	}
	
	public Language languageEntitytoLanguageModel(LanguageEntity languageEntity)
	{
		Language language = new Language();
		language.setFirstName(languageEntity.getIdLanguage());
		language.setFirstName(languageEntity.getName());
		
		return language;
	}
	
	//FIGURINE ============================================================================
	public FigurineEntity figurineModeltoFigurineEntity(Figurine figurine)
	{
		FigurineEntity figurineEntity = new FigurineEntity();
		figurineEntity.setIdFigurine(figurine.getIdFigurine());
		figurineEntity.setName(figurine.getName());
		figurineEntity.setDescription(figurine.getDescription());
		figurineEntity.setWeight(figurine.getWeight());
		figurineEntity.setSize(figurine.getSize());
		figurineEntity.setBrand(figurine.getBrand());
		figurineEntity.setPainting(figurine.getPainting());
		figurineEntity.setNbStock(figurine.getNbStock());
		figurineEntity.setCost(figurine.getCost());
		
		return figurineEntity;
	}
	
	public Figurine figurineEntitytoFigurineModel(FigurineEntity figurineEntity)
	{
		Figurine figurine = new Figurine();
		figurine.setIdFigurine(figurineEntity.getIdFigurine());
		figurine.setName(figurineEntity.getName());
		figurine.setDescription(figurineEntity.getDescription());
		figurine.setWeight(figurineEntity.getWeight());
		figurine.setSize(figurineEntity.getSize());
		figurine.setBrand(figurineEntity.getBrand());
		figurine.setPainting(figurineEntity.getPainting());
		figurine.setNbStock(figurineEntity.getNbStock());
		figurine.setCost(figurineEntity.getCost());
		
		return figurine;
	}
	
	//COMMANDLINE =========================================================================
	public CommandLineEntity commandLineModeltoCommandLineEntity(CommandLine commandeLine)
	{
		CommandLineEntity commandLineEntity = new CommandLineEntity();
		commandLineEntity.setNbFigurine(commandeLine.getNbFigurine());
		commandLineEntity.setPrizeCommand(commandeLine.getPrizeCommand());
		commandLineEntity.setPromotion(commandeLine.getPrizeCommand());
		
		return commandLineEntity;
	}
	
	public CommandLine commandLineEntitytoCommandLineModel(CommandLineEntity commandLineEntity)
	{
		CommandLine commandeLine = new CommandLine();
		commandeLine.setNbFigurine(commandeLine.getNbFigurine());
		commandeLine.setPrizeCommand(commandeLine.getPrizeCommand());
		commandeLine.setPromotion(commandeLine.getPromotion());
		
		return commandeLine;
	}
	
	//COMMAND ==============================================================================
	public CommandEntity commandModeltoCommandEntity(Command command)
	{
		CommandEntity commandEntity = new CommandEntity();
		commandEntity.setIdCommand(command.getIdCommand());
		commandEntity.setDateCommand(command.getDateCommand());
		
		return commandEntity;
	}
	
	public Command commandEntitytoCommandModel(CommandEntity commandEntity)
	{
		CommandEntity command = new CommandEntity();
		command.setIdCommand(commandEntity.getIdCommand());
		command.setDateCommand(commandEntity.getDateCommand());
		
		return command;
	}
	
	//CATEGORY
	public TranslationCategoryEntity translationCategoryModeltoTranslationCategoryEntity(TranslationFigurine translationCategory)
	{
		TranslationCategoryEntity translationCategoryEntity = new TranslationCategoryEntity();
		translationCategoryEntity.setFirstName(translationCategory.getName());
		
		return translationCategoryEntity;
	}
	
	public TranslationCategory translationCategoryEntitytoTranslationCategoryModel(TranslationFigurineEntity translationCategoryEntity)
	{
		TranslationCategory translationCategory = new TranslationCategory();
		translationCategory.setIdUser(translationCategoryEntity.getName());
		
		return translationCategory;
	}
	
}
