package services;

import com.google.inject.Inject;
import models.ChatMessage;
import models.User;
import repositories.ChatRepository;
import repositories.UserRepository;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ChatMessageService {

    @Inject
    UserRepository userRepository;

    @Inject
    ChatRepository chatRepository;

    static List<String> greetingFunctions = Arrays.asList("hi", "hello", "hola");
    static List<String> sendingOffFunctions = Arrays.asList("bye", "see you");

    public List<ChatMessage> getAllByUser(String username) {
        User user = userRepository.findByName(username);
        List<ChatMessage> chatMessages =  chatRepository.findByUserId(user.get_id());
        return chatMessages.stream().sorted(Comparator.comparing(ChatMessage::getSentTime)).collect(Collectors.toList());
    }

    public void saveResponseForMessage(String username, String message) {
        User user = userRepository.findByName(username);
        String response = getResponseForMessage(message, username);
        ChatMessage chatMessage = new ChatMessage(response, "Jarvis", System.currentTimeMillis(), user.get_id());
        chatRepository.save(chatMessage);
    }

    public String getResponseForMessage(String message, String username) {
        for (String greeting : greetingFunctions) {
            if (message.toLowerCase().contains(greeting)) {
                return "Hello ".concat(username).concat("!!!");
            }
        }

        for (String sendOff : sendingOffFunctions) {
            if (message.toLowerCase().contains(sendOff)) {
                return "Thank you, ".concat(username);
            }
        }

        if(message.toLowerCase().equals("how are you")){return "I'm fine";}
        if(message.toLowerCase().equals("am i allowed Grace time")){ return "Yes,30 mins grace time";}
        if(message.toLowerCase().equals("am i allowed Grace time early clockout")){ return "No,0 mins grace time";}
        if(message.toLowerCase().equals("will overtime be counted")){ return "No";}
        if(message.toLowerCase().equals("are attendance punches considered only within the buffer time")){ return "Yes,05:00 hrs before shift and 05:00 hrs after shift";}
        if(message.toLowerCase().equals("max optional holidays you can take")){ return "No,0 holidays allowed";}
        if(message.toLowerCase().equals("attendance Marking Policy")){ return "Yes,Both In Time & Out Time";}
        if(message.toLowerCase().equals("am i allowed to apply for attendance request on Weekly Off")){ return "No";}
        if(message.toLowerCase().equals("am i allowed to apply for attendance request on Holiday")){ return "No";}
        if(message.toLowerCase().equals("am i allowed to apply Clock in request")){ return "No";}
        if(message.toLowerCase().equals("am i allowed to apply for attendance request for future dates")){ return "Yes";}
        if(message.toLowerCase().equals("am i allowed to apply for out duty for future dates")){ return "No";}
        if(message.toLowerCase().equals("am i allowed to apply for shift change for future dates")){ return "No";}
        if(message.toLowerCase().equals("am i allowed to apply for short leave for future dates")){ return "No";}
        if(message.toLowerCase().equals("deduct leaves automatically when absent")){ return "Yes,Casual Leave";}
        if(message.toLowerCase().equals("is the auto-leave Unpaid")){ return "No";}
        if(message.toLowerCase().equals("is there leave deduction only for late marks")){ return "Yes";}
        if(message.toLowerCase().equals("how many late marks will trigger leave")){ return "Yes,3";}
        if(message.toLowerCase().equals("will it be half day or full day leave")){ return "Yes,Half Day";}
        if(message.toLowerCase().equals("which type of leave will be deducted")){ return "Yes,Casual Leave";}
        if(message.toLowerCase().equals("will it be counted Unpaid")){ return "No";}
        if(message.toLowerCase().equals("is there leave deduction only for early clock out")){ return "No";}
        if(message.toLowerCase().equals("is there Work Duration Policy")){ return "No";}
        if(message.toLowerCase().equals("is there leave deduction based on combined early clock out and late mark")){ return "No";}
        if(message.toLowerCase().equals("number of Leave allocated per year")){return "You are entitled to take 7 Days of leave annually.";}
        if(message.toLowerCase().equals("leave becomes valid after? (in months)")){return "You are eligible to use this leave, after you complete 0 month(s) of work.";}
        if(message.toLowerCase().equals("maximum number of leave allowed in a month?")){return "You can take any number of leave in a month.";}
        if(message.toLowerCase().equals("maximum consecutive days allowed?")){return "You can take any number of consecutive days in a month.";}
        if(message.toLowerCase().equals("leave applicable for?")){return "Leave applicable for only male.";}
        if(message.toLowerCase().equals("leave cycle?")){return "Continuous Cycle";}
        if(message.toLowerCase().equals("will this leave be prorated?")){return "Leave balance will be NOT be calculated pro-rata, based on your joining date.";}
        if(message.toLowerCase().equals("leave is credited on an Accrual basis?")){return "Leave is credited to your account all at once. They will be available in your leave balance from your joining date or start of the annual leave cycle, which ever comes first.";}
        if(message.toLowerCase().equals("is the number of leave accrued linked to tenure?")){return "No.";}
        if(message.toLowerCase().equals("is a Half Day allowed for this leave?")){return "You cannot take half day leave with this leave type.";}
        if(message.toLowerCase().equals("unused Leave Carryover rules")){return "At the end of the annual leave cycle, none of your unused leave will be carried forward to the next annual leave cycle.";}
        if(message.toLowerCase().equals("count intervening holidays as Leave?")){return "If there is any company designated public holiday(s) falling in between the leave application dates, those public holiday(s) will also be counted as leave.";}
        if(message.toLowerCase().equals("count intervening WeeklyOffs as Leave?")){return "If there is any company designated WeeklyOffs falling in between the leave application dates, those WeeklyOffs will also be counted as leave.";}
        if(message.toLowerCase().equals("allow applying for leave taken on previous dates?")){return "You can apply for this leave only on/before the leave date.";}
        if(message.toLowerCase().equals("allow clubbing of this leave with other leave?")){return "You cannot club this leave with any other leave.";}
        if(message.toLowerCase().equals("allow over-utilization of this leave?")){return "You cannot over-utilize this leave.";}
        if(message.toLowerCase().equals("is leave application allowed?")){return "You can apply for this leave.";}
        if(message.toLowerCase().equals("is leave application in probation period allowed?")){return "You can apply for this leave in probation period.";}
        if(message.toLowerCase().equals("is leave application in notice period allowed?")){return "You cannot apply for this leave in notice period.";}
        if(message.toLowerCase().equals("minimum consecutive days allowed in a single application?")){return "You can take any number of consecutive leave in application.";}
        if(message.toLowerCase().equals("maximum consecutive days allowed in a single application?")){return "You can take a maximum of 7 consecutive leaves in a single application.";}
        if(message.toLowerCase().equals("maximum leave applications allowed per month?")){return "You can apply any number of times in a month.";}
        if(message.toLowerCase().equals("maximum leave applications allowed per year?")){return "You can apply for maximum of 1 times in a year.";}
        if(message.toLowerCase().equals("maximum leave applications allowed in tenure?")){return "You can apply for maximum of 2 times in a tenure.";}
        return "Sorry, I didn't get that";
    }

    public void saveUserMessage(String username, String message) {
        User user = userRepository.findByName(username);
        ChatMessage chatMessage = new ChatMessage(message, username, System.currentTimeMillis(), user.get_id());
        chatRepository.save(chatMessage);
    }

}
