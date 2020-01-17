package pt.upacademy.coreFinalProject.models.converters;

import pt.upacademy.coreFinalProject.models.Question;
import pt.upacademy.coreFinalProject.models.DTOS.QuestionDTO;


public class QuestionConverter {

	@Override
	public Question toEntity(QuestionDTO dto) {
		Question Question = new Question();
		Question.setID(dto.getId());
		Question.setQuestion(dto.getQuestion());
		Question.setaType(dto.getaType());
		Question.setOptions(dto.getOptions());
		Question.setFilter(dto.getFilter());
		
		
		return Question;
	}
	
	@Override
	public QuestionDTO toDTO(Question entity) {
		QuestionDTO QuestionDTO = new QuestionDTO();
		QuestionDTO.setId(entity.getID());
		QuestionDTO.setQuestion(entity.getQuestion());
		QuestionDTO.setaType(entity.getaType());
		QuestionDTO.setOptions(entity.getOptions());
		QuestionDTO.setFilter(entity.getFilter());
		
		return QuestionDTO;
	}
}