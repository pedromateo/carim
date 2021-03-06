/**
 */
package org.mmi.events.impl;

import org.carim.model.carimModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.mmi.events.ASRRejectionEvent;
import org.mmi.events.AmbientUpdateEvent;
import org.mmi.events.AppEndEvent;
import org.mmi.events.AppStartEvent;
import org.mmi.events.BargeinEvent;
import org.mmi.events.CancelTurnEvent;
import org.mmi.events.ClickEvent;
import org.mmi.events.ClosedPromptEvent;
import org.mmi.events.CommunicationContextEvent;
import org.mmi.events.ContextEvent;
import org.mmi.events.CorrectAnswerEvent;
import org.mmi.events.CorrectionTurnEvent;
import org.mmi.events.CorrectlyParsedUtteranceEvent;
import org.mmi.events.DIVRejectionEvent;
import org.mmi.events.DeletedConceptsEvent;
import org.mmi.events.DeletedSentencesEvent;
import org.mmi.events.DeletedWordsEvent;
import org.mmi.events.DeviceContextEvent;
import org.mmi.events.DeviceFeaturesUpdateEvent;
import org.mmi.events.DeviceRunningFeaturesUpdateEvent;
import org.mmi.events.DeviceWorkloadUpdateEvent;
import org.mmi.events.DialogueContentEvent;
import org.mmi.events.EndDialogueEvent;
import org.mmi.events.EndSystemTurnEvent;
import org.mmi.events.EndUserTurnEvent;
import org.mmi.events.Event;
import org.mmi.events.EventsFactory;
import org.mmi.events.EventsPackage;
import org.mmi.events.GRRejectionEvent;
import org.mmi.events.GuiConceptsEvent;
import org.mmi.events.GuiElementsEvent;
import org.mmi.events.GuiFeedbackEvent;
import org.mmi.events.GuiNoiseEvent;
import org.mmi.events.GuiQuestionsEvent;
import org.mmi.events.HalfOpenPromptEvent;
import org.mmi.events.HelpTurnEvent;
import org.mmi.events.IncorrectAnswerEvent;
import org.mmi.events.IncorrectlyParsedUtteranceEvent;
import org.mmi.events.InputEvent;
import org.mmi.events.InsertedConceptsEvent;
import org.mmi.events.InsertedSentencesEvent;
import org.mmi.events.InsertedWordsEvent;
import org.mmi.events.KeyCommandEvent;
import org.mmi.events.KeyExploreEvent;
import org.mmi.events.KeyTextEvent;
import org.mmi.events.LocationTimeContextEvent;
import org.mmi.events.LocationUpdateEvent;
import org.mmi.events.LongClickEvent;
import org.mmi.events.MetacommEvent;
import org.mmi.events.MobilityUpdateEvent;
import org.mmi.events.MotionActionEvent;
import org.mmi.events.MotionEvent;
import org.mmi.events.MoveEvent;
import org.mmi.events.NavigationActionEvent;
import org.mmi.events.NavigationEvent;
import org.mmi.events.NavigationExploreEvent;
import org.mmi.events.NavigationMoveEvent;
import org.mmi.events.NewConceptsEvent;
import org.mmi.events.NewElementsEvent;
import org.mmi.events.NewFeedbackElementsEvent;
import org.mmi.events.NewNoiseEvent;
import org.mmi.events.NewQuestionsEvent;
import org.mmi.events.NoQuestionPromptEvent;
import org.mmi.events.NotAnswerEvent;
import org.mmi.events.OpenPromptEvent;
import org.mmi.events.OutputEvent;
import org.mmi.events.OverallConceptsEvent;
import org.mmi.events.OverallSentencesEvent;
import org.mmi.events.OverallWordsEvent;
import org.mmi.events.PartiallyCorrectAnswerEvent;
import org.mmi.events.PartiallyParsedUtteranceEvent;
import org.mmi.events.PhysicalEnvironmentContextEvent;
import org.mmi.events.RestartTurnEvent;
import org.mmi.events.ScreenContentEvent;
import org.mmi.events.ScreenEvent;
import org.mmi.events.ScrollEvent;
import org.mmi.events.ServerResponseUpdateEvent;
import org.mmi.events.ShakeEvent;
import org.mmi.events.SignalUpdateEvent;
import org.mmi.events.SocialContextEvent;
import org.mmi.events.SocialUpdateEvent;
import org.mmi.events.SpeechConceptsEvent;
import org.mmi.events.SpeechElementsEvent;
import org.mmi.events.SpeechFeedbackEvent;
import org.mmi.events.SpeechInputEvent;
import org.mmi.events.SpeechNoiseEvent;
import org.mmi.events.SpeechOutputContentEvent;
import org.mmi.events.SpeechOutputEvent;
import org.mmi.events.SpeechQuestionsEvent;
import org.mmi.events.StartDialogueEvent;
import org.mmi.events.StartSystemTurnEvent;
import org.mmi.events.StartUserTurnEvent;
import org.mmi.events.SubstitutedConceptsEvent;
import org.mmi.events.SubstitutedSentencesEvent;
import org.mmi.events.SubstitutedWordsEvent;
import org.mmi.events.SystemActionEndEvent;
import org.mmi.events.SystemActionStartEvent;
import org.mmi.events.SystemFeedbackStartEvent;
import org.mmi.events.TextCommandEvent;
import org.mmi.events.TextEvent;
import org.mmi.events.TextExploreEvent;
import org.mmi.events.TextWordEvent;
import org.mmi.events.ThroughputUpdateEvent;
import org.mmi.events.TiltEvent;
import org.mmi.events.TimeUpdateEvent;
import org.mmi.events.TimeoutEvent;
import org.mmi.events.TouchEvent;
import org.mmi.events.TurnControlEvent;
import org.mmi.events.TurnTimingEvent;
import org.mmi.events.TwistEvent;
import org.mmi.events.UserActionEndEvent;
import org.mmi.events.UserActionStartEvent;
import org.mmi.events.UserAttitudeUpdateEvent;
import org.mmi.events.UserContextEvent;
import org.mmi.events.UserDataUpdateEvent;
import org.mmi.events.UserFeedbackStartEvent;
import org.mmi.events.UserMoodUpdateEvent;
import org.mmi.events.UserRatingsUpdateEvent;
import org.mmi.events.WeatherUpdateEvent;
import org.mmi.events.event_t;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventsPackageImpl extends EPackageImpl implements EventsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogueContentEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metacommEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnControlEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnTimingEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalEnvironmentContextEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weatherUpdateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ambientUpdateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userContextEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDataUpdateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userRatingsUpdateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userAttitudeUpdateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userMoodUpdateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialContextEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialUpdateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationTimeContextEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationUpdateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobilityUpdateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeUpdateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceContextEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceFeaturesUpdateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceRunningFeaturesUpdateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceWorkloadUpdateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationContextEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalUpdateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throughputUpdateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverResponseUpdateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechInputEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenContentEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechOutputEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechOutputContentEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clickEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longClickEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrollEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationMoveEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationActionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationExploreEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tiltEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twistEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shakeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motionActionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyTextEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyExploreEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyCommandEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textWordEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textExploreEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textCommandEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiElementsEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiFeedbackEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiConceptsEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiNoiseEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiQuestionsEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechElementsEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechFeedbackEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechConceptsEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechNoiseEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechQuestionsEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correctAnswerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incorrectAnswerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partiallyCorrectAnswerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notAnswerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openPromptEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass halfOpenPromptEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closedPromptEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noQuestionPromptEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overallWordsEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substitutedWordsEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deletedWordsEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertedWordsEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overallSentencesEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substitutedSentencesEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deletedSentencesEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertedSentencesEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overallConceptsEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substitutedConceptsEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deletedConceptsEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertedConceptsEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correctlyParsedUtteranceEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partiallyParsedUtteranceEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incorrectlyParsedUtteranceEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newElementsEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newFeedbackElementsEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newConceptsEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newNoiseEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newQuestionsEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helpTurnEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correctionTurnEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cancelTurnEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restartTurnEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bargeinEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divRejectionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asrRejectionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grRejectionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeoutEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appStartEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appEndEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startDialogueEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endDialogueEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startSystemTurnEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endSystemTurnEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startUserTurnEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endUserTurnEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemFeedbackStartEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemActionStartEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemActionEndEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userFeedbackStartEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userActionStartEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userActionEndEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum event_tEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.mmi.events.EventsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EventsPackageImpl() {
		super(eNS_URI, EventsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EventsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EventsPackage init() {
		if (isInited) return (EventsPackage)EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI);

		// Obtain or create and register package
		EventsPackageImpl theEventsPackage = (EventsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EventsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EventsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		carimModelPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEventsPackage.createPackageContents();

		// Initialize created meta-data
		theEventsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEventsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EventsPackage.eNS_URI, theEventsPackage);
		return theEventsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Type() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Timestamp() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputEvent() {
		return inputEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputEvent() {
		return outputEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogueContentEvent() {
		return dialogueContentEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogueContentEvent_Nitems() {
		return (EAttribute)dialogueContentEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetacommEvent() {
		return metacommEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnControlEvent() {
		return turnControlEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnTimingEvent() {
		return turnTimingEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextEvent() {
		return contextEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalEnvironmentContextEvent() {
		return physicalEnvironmentContextEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeatherUpdateEvent() {
		return weatherUpdateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeatherUpdateEvent_Temperature() {
		return (EAttribute)weatherUpdateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeatherUpdateEvent_Weather() {
		return (EAttribute)weatherUpdateEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmbientUpdateEvent() {
		return ambientUpdateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmbientUpdateEvent_Noise() {
		return (EAttribute)ambientUpdateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmbientUpdateEvent_Light() {
		return (EAttribute)ambientUpdateEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserContextEvent() {
		return userContextEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDataUpdateEvent() {
		return userDataUpdateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDataUpdateEvent_Age() {
		return (EAttribute)userDataUpdateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDataUpdateEvent_Gender() {
		return (EAttribute)userDataUpdateEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDataUpdateEvent_EducationLevel() {
		return (EAttribute)userDataUpdateEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDataUpdateEvent_PreviousExperience() {
		return (EAttribute)userDataUpdateEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserRatingsUpdateEvent() {
		return userRatingsUpdateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatingsUpdateEvent_Practical() {
		return (EAttribute)userRatingsUpdateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatingsUpdateEvent_Predictable() {
		return (EAttribute)userRatingsUpdateEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatingsUpdateEvent_ClearlyStructured() {
		return (EAttribute)userRatingsUpdateEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatingsUpdateEvent_Simple() {
		return (EAttribute)userRatingsUpdateEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatingsUpdateEvent_Stylish() {
		return (EAttribute)userRatingsUpdateEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatingsUpdateEvent_Premium() {
		return (EAttribute)userRatingsUpdateEventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatingsUpdateEvent_Creative() {
		return (EAttribute)userRatingsUpdateEventEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatingsUpdateEvent_Captivating() {
		return (EAttribute)userRatingsUpdateEventEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatingsUpdateEvent_Beautiful() {
		return (EAttribute)userRatingsUpdateEventEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatingsUpdateEvent_Good() {
		return (EAttribute)userRatingsUpdateEventEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserAttitudeUpdateEvent() {
		return userAttitudeUpdateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserAttitudeUpdateEvent_Usefulness() {
		return (EAttribute)userAttitudeUpdateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserAttitudeUpdateEvent_Pleasantness() {
		return (EAttribute)userAttitudeUpdateEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserAttitudeUpdateEvent_Integration() {
		return (EAttribute)userAttitudeUpdateEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserAttitudeUpdateEvent_SelfEfficacy() {
		return (EAttribute)userAttitudeUpdateEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserAttitudeUpdateEvent_Comfort() {
		return (EAttribute)userAttitudeUpdateEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserMoodUpdateEvent() {
		return userMoodUpdateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMoodUpdateEvent_Mood() {
		return (EAttribute)userMoodUpdateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialContextEvent() {
		return socialContextEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialUpdateEvent() {
		return socialUpdateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSocialUpdateEvent_SocialCompany() {
		return (EAttribute)socialUpdateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSocialUpdateEvent_SocialArena() {
		return (EAttribute)socialUpdateEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationTimeContextEvent() {
		return locationTimeContextEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationUpdateEvent() {
		return locationUpdateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationUpdateEvent_Location() {
		return (EAttribute)locationUpdateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationUpdateEvent_Geo_latitude() {
		return (EAttribute)locationUpdateEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationUpdateEvent_Geo_longitude() {
		return (EAttribute)locationUpdateEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobilityUpdateEvent() {
		return mobilityUpdateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobilityUpdateEvent_MobilityLevel() {
		return (EAttribute)mobilityUpdateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeUpdateEvent() {
		return timeUpdateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeUpdateEvent_T_hours() {
		return (EAttribute)timeUpdateEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeUpdateEvent_T_mins() {
		return (EAttribute)timeUpdateEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeUpdateEvent_T_secs() {
		return (EAttribute)timeUpdateEventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeUpdateEvent_D_year() {
		return (EAttribute)timeUpdateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeUpdateEvent_D_month() {
		return (EAttribute)timeUpdateEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeUpdateEvent_D_day() {
		return (EAttribute)timeUpdateEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceContextEvent() {
		return deviceContextEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceFeaturesUpdateEvent() {
		return deviceFeaturesUpdateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceFeaturesUpdateEvent_DeviceType() {
		return (EAttribute)deviceFeaturesUpdateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceFeaturesUpdateEvent_ScreenSize() {
		return (EAttribute)deviceFeaturesUpdateEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceFeaturesUpdateEvent_ScreenResolution() {
		return (EAttribute)deviceFeaturesUpdateEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceRunningFeaturesUpdateEvent() {
		return deviceRunningFeaturesUpdateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceRunningFeaturesUpdateEvent_ScreenOrientation() {
		return (EAttribute)deviceRunningFeaturesUpdateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceRunningFeaturesUpdateEvent_Brightness() {
		return (EAttribute)deviceRunningFeaturesUpdateEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceRunningFeaturesUpdateEvent_Volume() {
		return (EAttribute)deviceRunningFeaturesUpdateEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceWorkloadUpdateEvent() {
		return deviceWorkloadUpdateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceWorkloadUpdateEvent_MemoryUsage() {
		return (EAttribute)deviceWorkloadUpdateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceWorkloadUpdateEvent_CpuUsage() {
		return (EAttribute)deviceWorkloadUpdateEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationContextEvent() {
		return communicationContextEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalUpdateEvent() {
		return signalUpdateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalUpdateEvent_WirelessAccessType() {
		return (EAttribute)signalUpdateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalUpdateEvent_AccessPointName() {
		return (EAttribute)signalUpdateEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalUpdateEvent_SignalStrength() {
		return (EAttribute)signalUpdateEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThroughputUpdateEvent() {
		return throughputUpdateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThroughputUpdateEvent_ReceivedData() {
		return (EAttribute)throughputUpdateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThroughputUpdateEvent_SentData() {
		return (EAttribute)throughputUpdateEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerResponseUpdateEvent() {
		return serverResponseUpdateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerResponseUpdateEvent_Rtt() {
		return (EAttribute)serverResponseUpdateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerResponseUpdateEvent_Srt() {
		return (EAttribute)serverResponseUpdateEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationEvent() {
		return navigationEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotionEvent() {
		return motionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextEvent() {
		return textEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeechInputEvent() {
		return speechInputEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScreenEvent() {
		return screenEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScreenContentEvent() {
		return screenContentEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreenContentEvent_Nitems() {
		return (EAttribute)screenContentEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeechOutputEvent() {
		return speechOutputEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeechOutputContentEvent() {
		return speechOutputContentEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechOutputContentEvent_Nitems() {
		return (EAttribute)speechOutputContentEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchEvent() {
		return touchEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClickEvent() {
		return clickEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongClickEvent() {
		return longClickEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrollEvent() {
		return scrollEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveEvent() {
		return moveEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveEvent_Length() {
		return (EAttribute)moveEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationMoveEvent() {
		return navigationMoveEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavigationMoveEvent_Length() {
		return (EAttribute)navigationMoveEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationActionEvent() {
		return navigationActionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationExploreEvent() {
		return navigationExploreEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTiltEvent() {
		return tiltEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwistEvent() {
		return twistEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShakeEvent() {
		return shakeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotionActionEvent() {
		return motionActionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyTextEvent() {
		return keyTextEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyTextEvent_Code() {
		return (EAttribute)keyTextEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyExploreEvent() {
		return keyExploreEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyExploreEvent_Code() {
		return (EAttribute)keyExploreEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyCommandEvent() {
		return keyCommandEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyCommandEvent_Code() {
		return (EAttribute)keyCommandEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextWordEvent() {
		return textWordEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextExploreEvent() {
		return textExploreEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextCommandEvent() {
		return textCommandEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiElementsEvent() {
		return guiElementsEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiFeedbackEvent() {
		return guiFeedbackEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiConceptsEvent() {
		return guiConceptsEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiNoiseEvent() {
		return guiNoiseEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiQuestionsEvent() {
		return guiQuestionsEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeechElementsEvent() {
		return speechElementsEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeechFeedbackEvent() {
		return speechFeedbackEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeechConceptsEvent() {
		return speechConceptsEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeechNoiseEvent() {
		return speechNoiseEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeechQuestionsEvent() {
		return speechQuestionsEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrectAnswerEvent() {
		return correctAnswerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncorrectAnswerEvent() {
		return incorrectAnswerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartiallyCorrectAnswerEvent() {
		return partiallyCorrectAnswerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotAnswerEvent() {
		return notAnswerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenPromptEvent() {
		return openPromptEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHalfOpenPromptEvent() {
		return halfOpenPromptEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClosedPromptEvent() {
		return closedPromptEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoQuestionPromptEvent() {
		return noQuestionPromptEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverallWordsEvent() {
		return overallWordsEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverallWordsEvent_Nwords() {
		return (EAttribute)overallWordsEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstitutedWordsEvent() {
		return substitutedWordsEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstitutedWordsEvent_Nwords() {
		return (EAttribute)substitutedWordsEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeletedWordsEvent() {
		return deletedWordsEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeletedWordsEvent_Nwords() {
		return (EAttribute)deletedWordsEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsertedWordsEvent() {
		return insertedWordsEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertedWordsEvent_Nwords() {
		return (EAttribute)insertedWordsEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverallSentencesEvent() {
		return overallSentencesEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverallSentencesEvent_Nsentences() {
		return (EAttribute)overallSentencesEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstitutedSentencesEvent() {
		return substitutedSentencesEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstitutedSentencesEvent_Nsentences() {
		return (EAttribute)substitutedSentencesEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeletedSentencesEvent() {
		return deletedSentencesEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeletedSentencesEvent_Nsentences() {
		return (EAttribute)deletedSentencesEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsertedSentencesEvent() {
		return insertedSentencesEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertedSentencesEvent_Nsentences() {
		return (EAttribute)insertedSentencesEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverallConceptsEvent() {
		return overallConceptsEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverallConceptsEvent_Nconcepts() {
		return (EAttribute)overallConceptsEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstitutedConceptsEvent() {
		return substitutedConceptsEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstitutedConceptsEvent_Nconcepts() {
		return (EAttribute)substitutedConceptsEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeletedConceptsEvent() {
		return deletedConceptsEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeletedConceptsEvent_Nconcepts() {
		return (EAttribute)deletedConceptsEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsertedConceptsEvent() {
		return insertedConceptsEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertedConceptsEvent_Nconcepts() {
		return (EAttribute)insertedConceptsEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrectlyParsedUtteranceEvent() {
		return correctlyParsedUtteranceEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartiallyParsedUtteranceEvent() {
		return partiallyParsedUtteranceEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncorrectlyParsedUtteranceEvent() {
		return incorrectlyParsedUtteranceEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewElementsEvent() {
		return newElementsEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewFeedbackElementsEvent() {
		return newFeedbackElementsEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewConceptsEvent() {
		return newConceptsEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewNoiseEvent() {
		return newNoiseEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewQuestionsEvent() {
		return newQuestionsEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHelpTurnEvent() {
		return helpTurnEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrectionTurnEvent() {
		return correctionTurnEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCancelTurnEvent() {
		return cancelTurnEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestartTurnEvent() {
		return restartTurnEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBargeinEvent() {
		return bargeinEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBargeinEvent_Successful() {
		return (EAttribute)bargeinEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDIVRejectionEvent() {
		return divRejectionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASRRejectionEvent() {
		return asrRejectionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGRRejectionEvent() {
		return grRejectionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeoutEvent() {
		return timeoutEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppStartEvent() {
		return appStartEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppEndEvent() {
		return appEndEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartDialogueEvent() {
		return startDialogueEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndDialogueEvent() {
		return endDialogueEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartSystemTurnEvent() {
		return startSystemTurnEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndSystemTurnEvent() {
		return endSystemTurnEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartUserTurnEvent() {
		return startUserTurnEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndUserTurnEvent() {
		return endUserTurnEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemFeedbackStartEvent() {
		return systemFeedbackStartEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemActionStartEvent() {
		return systemActionStartEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemActionEndEvent() {
		return systemActionEndEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserFeedbackStartEvent() {
		return userFeedbackStartEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserActionStartEvent() {
		return userActionStartEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserActionEndEvent() {
		return userActionEndEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getevent_t() {
		return event_tEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventsFactory getEventsFactory() {
		return (EventsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__TYPE);
		createEAttribute(eventEClass, EVENT__TIMESTAMP);

		inputEventEClass = createEClass(INPUT_EVENT);

		outputEventEClass = createEClass(OUTPUT_EVENT);

		dialogueContentEventEClass = createEClass(DIALOGUE_CONTENT_EVENT);
		createEAttribute(dialogueContentEventEClass, DIALOGUE_CONTENT_EVENT__NITEMS);

		metacommEventEClass = createEClass(METACOMM_EVENT);

		turnControlEventEClass = createEClass(TURN_CONTROL_EVENT);

		turnTimingEventEClass = createEClass(TURN_TIMING_EVENT);

		contextEventEClass = createEClass(CONTEXT_EVENT);

		physicalEnvironmentContextEventEClass = createEClass(PHYSICAL_ENVIRONMENT_CONTEXT_EVENT);

		weatherUpdateEventEClass = createEClass(WEATHER_UPDATE_EVENT);
		createEAttribute(weatherUpdateEventEClass, WEATHER_UPDATE_EVENT__TEMPERATURE);
		createEAttribute(weatherUpdateEventEClass, WEATHER_UPDATE_EVENT__WEATHER);

		ambientUpdateEventEClass = createEClass(AMBIENT_UPDATE_EVENT);
		createEAttribute(ambientUpdateEventEClass, AMBIENT_UPDATE_EVENT__NOISE);
		createEAttribute(ambientUpdateEventEClass, AMBIENT_UPDATE_EVENT__LIGHT);

		userContextEventEClass = createEClass(USER_CONTEXT_EVENT);

		userDataUpdateEventEClass = createEClass(USER_DATA_UPDATE_EVENT);
		createEAttribute(userDataUpdateEventEClass, USER_DATA_UPDATE_EVENT__AGE);
		createEAttribute(userDataUpdateEventEClass, USER_DATA_UPDATE_EVENT__GENDER);
		createEAttribute(userDataUpdateEventEClass, USER_DATA_UPDATE_EVENT__EDUCATION_LEVEL);
		createEAttribute(userDataUpdateEventEClass, USER_DATA_UPDATE_EVENT__PREVIOUS_EXPERIENCE);

		userRatingsUpdateEventEClass = createEClass(USER_RATINGS_UPDATE_EVENT);
		createEAttribute(userRatingsUpdateEventEClass, USER_RATINGS_UPDATE_EVENT__PRACTICAL);
		createEAttribute(userRatingsUpdateEventEClass, USER_RATINGS_UPDATE_EVENT__PREDICTABLE);
		createEAttribute(userRatingsUpdateEventEClass, USER_RATINGS_UPDATE_EVENT__CLEARLY_STRUCTURED);
		createEAttribute(userRatingsUpdateEventEClass, USER_RATINGS_UPDATE_EVENT__SIMPLE);
		createEAttribute(userRatingsUpdateEventEClass, USER_RATINGS_UPDATE_EVENT__STYLISH);
		createEAttribute(userRatingsUpdateEventEClass, USER_RATINGS_UPDATE_EVENT__PREMIUM);
		createEAttribute(userRatingsUpdateEventEClass, USER_RATINGS_UPDATE_EVENT__CREATIVE);
		createEAttribute(userRatingsUpdateEventEClass, USER_RATINGS_UPDATE_EVENT__CAPTIVATING);
		createEAttribute(userRatingsUpdateEventEClass, USER_RATINGS_UPDATE_EVENT__BEAUTIFUL);
		createEAttribute(userRatingsUpdateEventEClass, USER_RATINGS_UPDATE_EVENT__GOOD);

		userAttitudeUpdateEventEClass = createEClass(USER_ATTITUDE_UPDATE_EVENT);
		createEAttribute(userAttitudeUpdateEventEClass, USER_ATTITUDE_UPDATE_EVENT__USEFULNESS);
		createEAttribute(userAttitudeUpdateEventEClass, USER_ATTITUDE_UPDATE_EVENT__PLEASANTNESS);
		createEAttribute(userAttitudeUpdateEventEClass, USER_ATTITUDE_UPDATE_EVENT__INTEGRATION);
		createEAttribute(userAttitudeUpdateEventEClass, USER_ATTITUDE_UPDATE_EVENT__SELF_EFFICACY);
		createEAttribute(userAttitudeUpdateEventEClass, USER_ATTITUDE_UPDATE_EVENT__COMFORT);

		userMoodUpdateEventEClass = createEClass(USER_MOOD_UPDATE_EVENT);
		createEAttribute(userMoodUpdateEventEClass, USER_MOOD_UPDATE_EVENT__MOOD);

		socialContextEventEClass = createEClass(SOCIAL_CONTEXT_EVENT);

		socialUpdateEventEClass = createEClass(SOCIAL_UPDATE_EVENT);
		createEAttribute(socialUpdateEventEClass, SOCIAL_UPDATE_EVENT__SOCIAL_COMPANY);
		createEAttribute(socialUpdateEventEClass, SOCIAL_UPDATE_EVENT__SOCIAL_ARENA);

		locationTimeContextEventEClass = createEClass(LOCATION_TIME_CONTEXT_EVENT);

		locationUpdateEventEClass = createEClass(LOCATION_UPDATE_EVENT);
		createEAttribute(locationUpdateEventEClass, LOCATION_UPDATE_EVENT__LOCATION);
		createEAttribute(locationUpdateEventEClass, LOCATION_UPDATE_EVENT__GEO_LATITUDE);
		createEAttribute(locationUpdateEventEClass, LOCATION_UPDATE_EVENT__GEO_LONGITUDE);

		mobilityUpdateEventEClass = createEClass(MOBILITY_UPDATE_EVENT);
		createEAttribute(mobilityUpdateEventEClass, MOBILITY_UPDATE_EVENT__MOBILITY_LEVEL);

		timeUpdateEventEClass = createEClass(TIME_UPDATE_EVENT);
		createEAttribute(timeUpdateEventEClass, TIME_UPDATE_EVENT__DYEAR);
		createEAttribute(timeUpdateEventEClass, TIME_UPDATE_EVENT__DMONTH);
		createEAttribute(timeUpdateEventEClass, TIME_UPDATE_EVENT__DDAY);
		createEAttribute(timeUpdateEventEClass, TIME_UPDATE_EVENT__THOURS);
		createEAttribute(timeUpdateEventEClass, TIME_UPDATE_EVENT__TMINS);
		createEAttribute(timeUpdateEventEClass, TIME_UPDATE_EVENT__TSECS);

		deviceContextEventEClass = createEClass(DEVICE_CONTEXT_EVENT);

		deviceFeaturesUpdateEventEClass = createEClass(DEVICE_FEATURES_UPDATE_EVENT);
		createEAttribute(deviceFeaturesUpdateEventEClass, DEVICE_FEATURES_UPDATE_EVENT__DEVICE_TYPE);
		createEAttribute(deviceFeaturesUpdateEventEClass, DEVICE_FEATURES_UPDATE_EVENT__SCREEN_SIZE);
		createEAttribute(deviceFeaturesUpdateEventEClass, DEVICE_FEATURES_UPDATE_EVENT__SCREEN_RESOLUTION);

		deviceRunningFeaturesUpdateEventEClass = createEClass(DEVICE_RUNNING_FEATURES_UPDATE_EVENT);
		createEAttribute(deviceRunningFeaturesUpdateEventEClass, DEVICE_RUNNING_FEATURES_UPDATE_EVENT__SCREEN_ORIENTATION);
		createEAttribute(deviceRunningFeaturesUpdateEventEClass, DEVICE_RUNNING_FEATURES_UPDATE_EVENT__BRIGHTNESS);
		createEAttribute(deviceRunningFeaturesUpdateEventEClass, DEVICE_RUNNING_FEATURES_UPDATE_EVENT__VOLUME);

		deviceWorkloadUpdateEventEClass = createEClass(DEVICE_WORKLOAD_UPDATE_EVENT);
		createEAttribute(deviceWorkloadUpdateEventEClass, DEVICE_WORKLOAD_UPDATE_EVENT__MEMORY_USAGE);
		createEAttribute(deviceWorkloadUpdateEventEClass, DEVICE_WORKLOAD_UPDATE_EVENT__CPU_USAGE);

		communicationContextEventEClass = createEClass(COMMUNICATION_CONTEXT_EVENT);

		signalUpdateEventEClass = createEClass(SIGNAL_UPDATE_EVENT);
		createEAttribute(signalUpdateEventEClass, SIGNAL_UPDATE_EVENT__WIRELESS_ACCESS_TYPE);
		createEAttribute(signalUpdateEventEClass, SIGNAL_UPDATE_EVENT__ACCESS_POINT_NAME);
		createEAttribute(signalUpdateEventEClass, SIGNAL_UPDATE_EVENT__SIGNAL_STRENGTH);

		throughputUpdateEventEClass = createEClass(THROUGHPUT_UPDATE_EVENT);
		createEAttribute(throughputUpdateEventEClass, THROUGHPUT_UPDATE_EVENT__RECEIVED_DATA);
		createEAttribute(throughputUpdateEventEClass, THROUGHPUT_UPDATE_EVENT__SENT_DATA);

		serverResponseUpdateEventEClass = createEClass(SERVER_RESPONSE_UPDATE_EVENT);
		createEAttribute(serverResponseUpdateEventEClass, SERVER_RESPONSE_UPDATE_EVENT__RTT);
		createEAttribute(serverResponseUpdateEventEClass, SERVER_RESPONSE_UPDATE_EVENT__SRT);

		navigationEventEClass = createEClass(NAVIGATION_EVENT);

		motionEventEClass = createEClass(MOTION_EVENT);

		textEventEClass = createEClass(TEXT_EVENT);

		speechInputEventEClass = createEClass(SPEECH_INPUT_EVENT);

		screenEventEClass = createEClass(SCREEN_EVENT);

		screenContentEventEClass = createEClass(SCREEN_CONTENT_EVENT);
		createEAttribute(screenContentEventEClass, SCREEN_CONTENT_EVENT__NITEMS);

		speechOutputEventEClass = createEClass(SPEECH_OUTPUT_EVENT);

		speechOutputContentEventEClass = createEClass(SPEECH_OUTPUT_CONTENT_EVENT);
		createEAttribute(speechOutputContentEventEClass, SPEECH_OUTPUT_CONTENT_EVENT__NITEMS);

		touchEventEClass = createEClass(TOUCH_EVENT);

		clickEventEClass = createEClass(CLICK_EVENT);

		longClickEventEClass = createEClass(LONG_CLICK_EVENT);

		scrollEventEClass = createEClass(SCROLL_EVENT);

		moveEventEClass = createEClass(MOVE_EVENT);
		createEAttribute(moveEventEClass, MOVE_EVENT__LENGTH);

		navigationMoveEventEClass = createEClass(NAVIGATION_MOVE_EVENT);
		createEAttribute(navigationMoveEventEClass, NAVIGATION_MOVE_EVENT__LENGTH);

		navigationActionEventEClass = createEClass(NAVIGATION_ACTION_EVENT);

		navigationExploreEventEClass = createEClass(NAVIGATION_EXPLORE_EVENT);

		tiltEventEClass = createEClass(TILT_EVENT);

		twistEventEClass = createEClass(TWIST_EVENT);

		shakeEventEClass = createEClass(SHAKE_EVENT);

		motionActionEventEClass = createEClass(MOTION_ACTION_EVENT);

		keyTextEventEClass = createEClass(KEY_TEXT_EVENT);
		createEAttribute(keyTextEventEClass, KEY_TEXT_EVENT__CODE);

		keyExploreEventEClass = createEClass(KEY_EXPLORE_EVENT);
		createEAttribute(keyExploreEventEClass, KEY_EXPLORE_EVENT__CODE);

		keyCommandEventEClass = createEClass(KEY_COMMAND_EVENT);
		createEAttribute(keyCommandEventEClass, KEY_COMMAND_EVENT__CODE);

		textWordEventEClass = createEClass(TEXT_WORD_EVENT);

		textExploreEventEClass = createEClass(TEXT_EXPLORE_EVENT);

		textCommandEventEClass = createEClass(TEXT_COMMAND_EVENT);

		guiElementsEventEClass = createEClass(GUI_ELEMENTS_EVENT);

		guiFeedbackEventEClass = createEClass(GUI_FEEDBACK_EVENT);

		guiConceptsEventEClass = createEClass(GUI_CONCEPTS_EVENT);

		guiNoiseEventEClass = createEClass(GUI_NOISE_EVENT);

		guiQuestionsEventEClass = createEClass(GUI_QUESTIONS_EVENT);

		speechElementsEventEClass = createEClass(SPEECH_ELEMENTS_EVENT);

		speechFeedbackEventEClass = createEClass(SPEECH_FEEDBACK_EVENT);

		speechConceptsEventEClass = createEClass(SPEECH_CONCEPTS_EVENT);

		speechNoiseEventEClass = createEClass(SPEECH_NOISE_EVENT);

		speechQuestionsEventEClass = createEClass(SPEECH_QUESTIONS_EVENT);

		correctAnswerEventEClass = createEClass(CORRECT_ANSWER_EVENT);

		incorrectAnswerEventEClass = createEClass(INCORRECT_ANSWER_EVENT);

		partiallyCorrectAnswerEventEClass = createEClass(PARTIALLY_CORRECT_ANSWER_EVENT);

		notAnswerEventEClass = createEClass(NOT_ANSWER_EVENT);

		openPromptEventEClass = createEClass(OPEN_PROMPT_EVENT);

		halfOpenPromptEventEClass = createEClass(HALF_OPEN_PROMPT_EVENT);

		closedPromptEventEClass = createEClass(CLOSED_PROMPT_EVENT);

		noQuestionPromptEventEClass = createEClass(NO_QUESTION_PROMPT_EVENT);

		overallWordsEventEClass = createEClass(OVERALL_WORDS_EVENT);
		createEAttribute(overallWordsEventEClass, OVERALL_WORDS_EVENT__NWORDS);

		substitutedWordsEventEClass = createEClass(SUBSTITUTED_WORDS_EVENT);
		createEAttribute(substitutedWordsEventEClass, SUBSTITUTED_WORDS_EVENT__NWORDS);

		deletedWordsEventEClass = createEClass(DELETED_WORDS_EVENT);
		createEAttribute(deletedWordsEventEClass, DELETED_WORDS_EVENT__NWORDS);

		insertedWordsEventEClass = createEClass(INSERTED_WORDS_EVENT);
		createEAttribute(insertedWordsEventEClass, INSERTED_WORDS_EVENT__NWORDS);

		overallSentencesEventEClass = createEClass(OVERALL_SENTENCES_EVENT);
		createEAttribute(overallSentencesEventEClass, OVERALL_SENTENCES_EVENT__NSENTENCES);

		substitutedSentencesEventEClass = createEClass(SUBSTITUTED_SENTENCES_EVENT);
		createEAttribute(substitutedSentencesEventEClass, SUBSTITUTED_SENTENCES_EVENT__NSENTENCES);

		deletedSentencesEventEClass = createEClass(DELETED_SENTENCES_EVENT);
		createEAttribute(deletedSentencesEventEClass, DELETED_SENTENCES_EVENT__NSENTENCES);

		insertedSentencesEventEClass = createEClass(INSERTED_SENTENCES_EVENT);
		createEAttribute(insertedSentencesEventEClass, INSERTED_SENTENCES_EVENT__NSENTENCES);

		overallConceptsEventEClass = createEClass(OVERALL_CONCEPTS_EVENT);
		createEAttribute(overallConceptsEventEClass, OVERALL_CONCEPTS_EVENT__NCONCEPTS);

		substitutedConceptsEventEClass = createEClass(SUBSTITUTED_CONCEPTS_EVENT);
		createEAttribute(substitutedConceptsEventEClass, SUBSTITUTED_CONCEPTS_EVENT__NCONCEPTS);

		deletedConceptsEventEClass = createEClass(DELETED_CONCEPTS_EVENT);
		createEAttribute(deletedConceptsEventEClass, DELETED_CONCEPTS_EVENT__NCONCEPTS);

		insertedConceptsEventEClass = createEClass(INSERTED_CONCEPTS_EVENT);
		createEAttribute(insertedConceptsEventEClass, INSERTED_CONCEPTS_EVENT__NCONCEPTS);

		correctlyParsedUtteranceEventEClass = createEClass(CORRECTLY_PARSED_UTTERANCE_EVENT);

		partiallyParsedUtteranceEventEClass = createEClass(PARTIALLY_PARSED_UTTERANCE_EVENT);

		incorrectlyParsedUtteranceEventEClass = createEClass(INCORRECTLY_PARSED_UTTERANCE_EVENT);

		newElementsEventEClass = createEClass(NEW_ELEMENTS_EVENT);

		newFeedbackElementsEventEClass = createEClass(NEW_FEEDBACK_ELEMENTS_EVENT);

		newConceptsEventEClass = createEClass(NEW_CONCEPTS_EVENT);

		newNoiseEventEClass = createEClass(NEW_NOISE_EVENT);

		newQuestionsEventEClass = createEClass(NEW_QUESTIONS_EVENT);

		helpTurnEventEClass = createEClass(HELP_TURN_EVENT);

		correctionTurnEventEClass = createEClass(CORRECTION_TURN_EVENT);

		cancelTurnEventEClass = createEClass(CANCEL_TURN_EVENT);

		restartTurnEventEClass = createEClass(RESTART_TURN_EVENT);

		bargeinEventEClass = createEClass(BARGEIN_EVENT);
		createEAttribute(bargeinEventEClass, BARGEIN_EVENT__SUCCESSFUL);

		divRejectionEventEClass = createEClass(DIV_REJECTION_EVENT);

		asrRejectionEventEClass = createEClass(ASR_REJECTION_EVENT);

		grRejectionEventEClass = createEClass(GR_REJECTION_EVENT);

		timeoutEventEClass = createEClass(TIMEOUT_EVENT);

		appStartEventEClass = createEClass(APP_START_EVENT);

		appEndEventEClass = createEClass(APP_END_EVENT);

		startDialogueEventEClass = createEClass(START_DIALOGUE_EVENT);

		endDialogueEventEClass = createEClass(END_DIALOGUE_EVENT);

		startSystemTurnEventEClass = createEClass(START_SYSTEM_TURN_EVENT);

		endSystemTurnEventEClass = createEClass(END_SYSTEM_TURN_EVENT);

		startUserTurnEventEClass = createEClass(START_USER_TURN_EVENT);

		endUserTurnEventEClass = createEClass(END_USER_TURN_EVENT);

		systemFeedbackStartEventEClass = createEClass(SYSTEM_FEEDBACK_START_EVENT);

		systemActionStartEventEClass = createEClass(SYSTEM_ACTION_START_EVENT);

		systemActionEndEventEClass = createEClass(SYSTEM_ACTION_END_EVENT);

		userFeedbackStartEventEClass = createEClass(USER_FEEDBACK_START_EVENT);

		userActionStartEventEClass = createEClass(USER_ACTION_START_EVENT);

		userActionEndEventEClass = createEClass(USER_ACTION_END_EVENT);

		// Create enums
		event_tEEnum = createEEnum(EVENT_T);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		carimModelPackage thecarimModelPackage = (carimModelPackage)EPackage.Registry.INSTANCE.getEPackage(carimModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inputEventEClass.getESuperTypes().add(this.getEvent());
		outputEventEClass.getESuperTypes().add(this.getEvent());
		dialogueContentEventEClass.getESuperTypes().add(this.getEvent());
		metacommEventEClass.getESuperTypes().add(this.getEvent());
		turnControlEventEClass.getESuperTypes().add(this.getEvent());
		turnTimingEventEClass.getESuperTypes().add(this.getEvent());
		contextEventEClass.getESuperTypes().add(this.getEvent());
		physicalEnvironmentContextEventEClass.getESuperTypes().add(this.getContextEvent());
		weatherUpdateEventEClass.getESuperTypes().add(this.getPhysicalEnvironmentContextEvent());
		ambientUpdateEventEClass.getESuperTypes().add(this.getPhysicalEnvironmentContextEvent());
		userContextEventEClass.getESuperTypes().add(this.getContextEvent());
		userDataUpdateEventEClass.getESuperTypes().add(this.getUserContextEvent());
		userRatingsUpdateEventEClass.getESuperTypes().add(this.getUserContextEvent());
		userAttitudeUpdateEventEClass.getESuperTypes().add(this.getUserContextEvent());
		userMoodUpdateEventEClass.getESuperTypes().add(this.getUserContextEvent());
		socialContextEventEClass.getESuperTypes().add(this.getContextEvent());
		socialUpdateEventEClass.getESuperTypes().add(this.getSocialContextEvent());
		locationTimeContextEventEClass.getESuperTypes().add(this.getContextEvent());
		locationUpdateEventEClass.getESuperTypes().add(this.getLocationTimeContextEvent());
		mobilityUpdateEventEClass.getESuperTypes().add(this.getLocationTimeContextEvent());
		timeUpdateEventEClass.getESuperTypes().add(this.getLocationTimeContextEvent());
		deviceContextEventEClass.getESuperTypes().add(this.getContextEvent());
		deviceFeaturesUpdateEventEClass.getESuperTypes().add(this.getDeviceContextEvent());
		deviceRunningFeaturesUpdateEventEClass.getESuperTypes().add(this.getDeviceContextEvent());
		deviceWorkloadUpdateEventEClass.getESuperTypes().add(this.getDeviceContextEvent());
		communicationContextEventEClass.getESuperTypes().add(this.getContextEvent());
		signalUpdateEventEClass.getESuperTypes().add(this.getCommunicationContextEvent());
		throughputUpdateEventEClass.getESuperTypes().add(this.getCommunicationContextEvent());
		serverResponseUpdateEventEClass.getESuperTypes().add(this.getCommunicationContextEvent());
		navigationEventEClass.getESuperTypes().add(this.getInputEvent());
		motionEventEClass.getESuperTypes().add(this.getInputEvent());
		textEventEClass.getESuperTypes().add(this.getInputEvent());
		speechInputEventEClass.getESuperTypes().add(this.getInputEvent());
		screenEventEClass.getESuperTypes().add(this.getOutputEvent());
		screenContentEventEClass.getESuperTypes().add(this.getScreenEvent());
		speechOutputEventEClass.getESuperTypes().add(this.getOutputEvent());
		speechOutputContentEventEClass.getESuperTypes().add(this.getSpeechOutputEvent());
		touchEventEClass.getESuperTypes().add(this.getNavigationEvent());
		clickEventEClass.getESuperTypes().add(this.getNavigationEvent());
		longClickEventEClass.getESuperTypes().add(this.getNavigationEvent());
		scrollEventEClass.getESuperTypes().add(this.getNavigationEvent());
		moveEventEClass.getESuperTypes().add(this.getNavigationEvent());
		navigationMoveEventEClass.getESuperTypes().add(this.getNavigationEvent());
		navigationActionEventEClass.getESuperTypes().add(this.getNavigationEvent());
		navigationExploreEventEClass.getESuperTypes().add(this.getNavigationEvent());
		tiltEventEClass.getESuperTypes().add(this.getMotionEvent());
		twistEventEClass.getESuperTypes().add(this.getMotionEvent());
		shakeEventEClass.getESuperTypes().add(this.getMotionEvent());
		motionActionEventEClass.getESuperTypes().add(this.getMotionEvent());
		keyTextEventEClass.getESuperTypes().add(this.getTextEvent());
		keyExploreEventEClass.getESuperTypes().add(this.getTextEvent());
		keyCommandEventEClass.getESuperTypes().add(this.getTextEvent());
		textWordEventEClass.getESuperTypes().add(this.getTextEvent());
		textExploreEventEClass.getESuperTypes().add(this.getTextEvent());
		textCommandEventEClass.getESuperTypes().add(this.getTextEvent());
		guiElementsEventEClass.getESuperTypes().add(this.getScreenContentEvent());
		guiFeedbackEventEClass.getESuperTypes().add(this.getScreenContentEvent());
		guiConceptsEventEClass.getESuperTypes().add(this.getScreenContentEvent());
		guiNoiseEventEClass.getESuperTypes().add(this.getScreenContentEvent());
		guiQuestionsEventEClass.getESuperTypes().add(this.getScreenContentEvent());
		speechElementsEventEClass.getESuperTypes().add(this.getSpeechOutputContentEvent());
		speechFeedbackEventEClass.getESuperTypes().add(this.getSpeechOutputContentEvent());
		speechConceptsEventEClass.getESuperTypes().add(this.getSpeechOutputContentEvent());
		speechNoiseEventEClass.getESuperTypes().add(this.getSpeechOutputContentEvent());
		speechQuestionsEventEClass.getESuperTypes().add(this.getSpeechOutputContentEvent());
		correctAnswerEventEClass.getESuperTypes().add(this.getSpeechOutputEvent());
		incorrectAnswerEventEClass.getESuperTypes().add(this.getSpeechOutputEvent());
		partiallyCorrectAnswerEventEClass.getESuperTypes().add(this.getSpeechOutputEvent());
		notAnswerEventEClass.getESuperTypes().add(this.getSpeechOutputEvent());
		openPromptEventEClass.getESuperTypes().add(this.getSpeechOutputEvent());
		halfOpenPromptEventEClass.getESuperTypes().add(this.getSpeechOutputEvent());
		closedPromptEventEClass.getESuperTypes().add(this.getSpeechOutputEvent());
		noQuestionPromptEventEClass.getESuperTypes().add(this.getSpeechOutputEvent());
		overallWordsEventEClass.getESuperTypes().add(this.getSpeechInputEvent());
		substitutedWordsEventEClass.getESuperTypes().add(this.getSpeechInputEvent());
		deletedWordsEventEClass.getESuperTypes().add(this.getSpeechInputEvent());
		insertedWordsEventEClass.getESuperTypes().add(this.getSpeechInputEvent());
		overallSentencesEventEClass.getESuperTypes().add(this.getSpeechInputEvent());
		substitutedSentencesEventEClass.getESuperTypes().add(this.getSpeechInputEvent());
		deletedSentencesEventEClass.getESuperTypes().add(this.getSpeechInputEvent());
		insertedSentencesEventEClass.getESuperTypes().add(this.getSpeechInputEvent());
		overallConceptsEventEClass.getESuperTypes().add(this.getSpeechInputEvent());
		substitutedConceptsEventEClass.getESuperTypes().add(this.getSpeechInputEvent());
		deletedConceptsEventEClass.getESuperTypes().add(this.getSpeechInputEvent());
		insertedConceptsEventEClass.getESuperTypes().add(this.getSpeechInputEvent());
		correctlyParsedUtteranceEventEClass.getESuperTypes().add(this.getSpeechInputEvent());
		partiallyParsedUtteranceEventEClass.getESuperTypes().add(this.getSpeechInputEvent());
		incorrectlyParsedUtteranceEventEClass.getESuperTypes().add(this.getSpeechInputEvent());
		newElementsEventEClass.getESuperTypes().add(this.getDialogueContentEvent());
		newFeedbackElementsEventEClass.getESuperTypes().add(this.getDialogueContentEvent());
		newConceptsEventEClass.getESuperTypes().add(this.getDialogueContentEvent());
		newNoiseEventEClass.getESuperTypes().add(this.getDialogueContentEvent());
		newQuestionsEventEClass.getESuperTypes().add(this.getDialogueContentEvent());
		helpTurnEventEClass.getESuperTypes().add(this.getMetacommEvent());
		correctionTurnEventEClass.getESuperTypes().add(this.getMetacommEvent());
		cancelTurnEventEClass.getESuperTypes().add(this.getMetacommEvent());
		restartTurnEventEClass.getESuperTypes().add(this.getMetacommEvent());
		bargeinEventEClass.getESuperTypes().add(this.getMetacommEvent());
		divRejectionEventEClass.getESuperTypes().add(this.getMetacommEvent());
		asrRejectionEventEClass.getESuperTypes().add(this.getMetacommEvent());
		grRejectionEventEClass.getESuperTypes().add(this.getMetacommEvent());
		timeoutEventEClass.getESuperTypes().add(this.getMetacommEvent());
		appStartEventEClass.getESuperTypes().add(this.getTurnControlEvent());
		appEndEventEClass.getESuperTypes().add(this.getTurnControlEvent());
		startDialogueEventEClass.getESuperTypes().add(this.getTurnControlEvent());
		endDialogueEventEClass.getESuperTypes().add(this.getTurnControlEvent());
		startSystemTurnEventEClass.getESuperTypes().add(this.getTurnControlEvent());
		endSystemTurnEventEClass.getESuperTypes().add(this.getTurnControlEvent());
		startUserTurnEventEClass.getESuperTypes().add(this.getTurnControlEvent());
		endUserTurnEventEClass.getESuperTypes().add(this.getTurnControlEvent());
		systemFeedbackStartEventEClass.getESuperTypes().add(this.getTurnTimingEvent());
		systemActionStartEventEClass.getESuperTypes().add(this.getTurnTimingEvent());
		systemActionEndEventEClass.getESuperTypes().add(this.getTurnTimingEvent());
		userFeedbackStartEventEClass.getESuperTypes().add(this.getTurnTimingEvent());
		userActionStartEventEClass.getESuperTypes().add(this.getTurnTimingEvent());
		userActionEndEventEClass.getESuperTypes().add(this.getTurnTimingEvent());

		// Initialize classes and features; add operations and parameters
		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Type(), theXMLTypePackage.getInt(), "type", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Timestamp(), theXMLTypePackage.getLong(), "timestamp", "0", 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEventEClass, InputEvent.class, "InputEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputEventEClass, OutputEvent.class, "OutputEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dialogueContentEventEClass, DialogueContentEvent.class, "DialogueContentEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDialogueContentEvent_Nitems(), theXMLTypePackage.getInt(), "nitems", null, 0, 1, DialogueContentEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metacommEventEClass, MetacommEvent.class, "MetacommEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnControlEventEClass, TurnControlEvent.class, "TurnControlEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnTimingEventEClass, TurnTimingEvent.class, "TurnTimingEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextEventEClass, ContextEvent.class, "ContextEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalEnvironmentContextEventEClass, PhysicalEnvironmentContextEvent.class, "PhysicalEnvironmentContextEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(weatherUpdateEventEClass, WeatherUpdateEvent.class, "WeatherUpdateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeatherUpdateEvent_Temperature(), theXMLTypePackage.getInt(), "temperature", null, 0, 1, WeatherUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherUpdateEvent_Weather(), thecarimModelPackage.getWeatherT(), "weather", null, 0, 1, WeatherUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ambientUpdateEventEClass, AmbientUpdateEvent.class, "AmbientUpdateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAmbientUpdateEvent_Noise(), thecarimModelPackage.getPercentageT(), "noise", null, 0, 1, AmbientUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmbientUpdateEvent_Light(), thecarimModelPackage.getPercentageT(), "light", null, 0, 1, AmbientUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userContextEventEClass, UserContextEvent.class, "UserContextEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userDataUpdateEventEClass, UserDataUpdateEvent.class, "UserDataUpdateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserDataUpdateEvent_Age(), theXMLTypePackage.getInt(), "age", null, 0, 1, UserDataUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserDataUpdateEvent_Gender(), thecarimModelPackage.getGenderT(), "gender", null, 0, 1, UserDataUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserDataUpdateEvent_EducationLevel(), thecarimModelPackage.getEducationLevelT(), "educationLevel", null, 0, 1, UserDataUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserDataUpdateEvent_PreviousExperience(), thecarimModelPackage.getPreviousExperienceT(), "previousExperience", null, 0, 1, UserDataUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userRatingsUpdateEventEClass, UserRatingsUpdateEvent.class, "UserRatingsUpdateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserRatingsUpdateEvent_Practical(), thecarimModelPackage.getLikert7Value(), "practical", null, 0, 1, UserRatingsUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRatingsUpdateEvent_Predictable(), thecarimModelPackage.getLikert7Value(), "predictable", null, 0, 1, UserRatingsUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRatingsUpdateEvent_ClearlyStructured(), thecarimModelPackage.getLikert7Value(), "clearlyStructured", null, 0, 1, UserRatingsUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRatingsUpdateEvent_Simple(), thecarimModelPackage.getLikert7Value(), "simple", null, 0, 1, UserRatingsUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRatingsUpdateEvent_Stylish(), thecarimModelPackage.getLikert7Value(), "stylish", null, 0, 1, UserRatingsUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRatingsUpdateEvent_Premium(), thecarimModelPackage.getLikert7Value(), "premium", null, 0, 1, UserRatingsUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRatingsUpdateEvent_Creative(), thecarimModelPackage.getLikert7Value(), "creative", null, 0, 1, UserRatingsUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRatingsUpdateEvent_Captivating(), thecarimModelPackage.getLikert7Value(), "captivating", null, 0, 1, UserRatingsUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRatingsUpdateEvent_Beautiful(), thecarimModelPackage.getLikert7Value(), "beautiful", null, 0, 1, UserRatingsUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRatingsUpdateEvent_Good(), thecarimModelPackage.getLikert7Value(), "good", null, 0, 1, UserRatingsUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userAttitudeUpdateEventEClass, UserAttitudeUpdateEvent.class, "UserAttitudeUpdateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserAttitudeUpdateEvent_Usefulness(), thecarimModelPackage.getLikert5Value(), "usefulness", null, 0, 1, UserAttitudeUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserAttitudeUpdateEvent_Pleasantness(), thecarimModelPackage.getLikert5Value(), "pleasantness", null, 0, 1, UserAttitudeUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserAttitudeUpdateEvent_Integration(), thecarimModelPackage.getLikert5Value(), "integration", null, 0, 1, UserAttitudeUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserAttitudeUpdateEvent_SelfEfficacy(), thecarimModelPackage.getLikert5Value(), "selfEfficacy", null, 0, 1, UserAttitudeUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserAttitudeUpdateEvent_Comfort(), thecarimModelPackage.getLikert5Value(), "comfort", null, 0, 1, UserAttitudeUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userMoodUpdateEventEClass, UserMoodUpdateEvent.class, "UserMoodUpdateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserMoodUpdateEvent_Mood(), thecarimModelPackage.getLikert5Value(), "mood", null, 0, 1, UserMoodUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(socialContextEventEClass, SocialContextEvent.class, "SocialContextEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(socialUpdateEventEClass, SocialUpdateEvent.class, "SocialUpdateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSocialUpdateEvent_SocialCompany(), thecarimModelPackage.getSocialCompanyT(), "socialCompany", null, 0, 1, SocialUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSocialUpdateEvent_SocialArena(), thecarimModelPackage.getSocialArenaT(), "socialArena", null, 0, 1, SocialUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationTimeContextEventEClass, LocationTimeContextEvent.class, "LocationTimeContextEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationUpdateEventEClass, LocationUpdateEvent.class, "LocationUpdateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocationUpdateEvent_Location(), thecarimModelPackage.getLocationT(), "location", null, 0, 1, LocationUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationUpdateEvent_Geo_latitude(), theXMLTypePackage.getDouble(), "geo_latitude", null, 0, 1, LocationUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationUpdateEvent_Geo_longitude(), theXMLTypePackage.getDouble(), "geo_longitude", null, 0, 1, LocationUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobilityUpdateEventEClass, MobilityUpdateEvent.class, "MobilityUpdateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobilityUpdateEvent_MobilityLevel(), thecarimModelPackage.getMobilityLevelT(), "mobilityLevel", null, 0, 1, MobilityUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeUpdateEventEClass, TimeUpdateEvent.class, "TimeUpdateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeUpdateEvent_D_year(), theXMLTypePackage.getInt(), "d_year", null, 0, 1, TimeUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeUpdateEvent_D_month(), theXMLTypePackage.getInt(), "d_month", null, 0, 1, TimeUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeUpdateEvent_D_day(), theXMLTypePackage.getInt(), "d_day", null, 0, 1, TimeUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeUpdateEvent_T_hours(), theXMLTypePackage.getInt(), "t_hours", null, 0, 1, TimeUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeUpdateEvent_T_mins(), theXMLTypePackage.getInt(), "t_mins", null, 0, 1, TimeUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeUpdateEvent_T_secs(), theXMLTypePackage.getInt(), "t_secs", null, 0, 1, TimeUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceContextEventEClass, DeviceContextEvent.class, "DeviceContextEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceFeaturesUpdateEventEClass, DeviceFeaturesUpdateEvent.class, "DeviceFeaturesUpdateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceFeaturesUpdateEvent_DeviceType(), thecarimModelPackage.getDeviceTypeT(), "deviceType", null, 0, 1, DeviceFeaturesUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceFeaturesUpdateEvent_ScreenSize(), thecarimModelPackage.getScreenSizeT(), "screenSize", null, 0, 1, DeviceFeaturesUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceFeaturesUpdateEvent_ScreenResolution(), thecarimModelPackage.getScreenResolutionT(), "screenResolution", null, 0, 1, DeviceFeaturesUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceRunningFeaturesUpdateEventEClass, DeviceRunningFeaturesUpdateEvent.class, "DeviceRunningFeaturesUpdateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceRunningFeaturesUpdateEvent_ScreenOrientation(), thecarimModelPackage.getScreenOrientationT(), "screenOrientation", null, 0, 1, DeviceRunningFeaturesUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceRunningFeaturesUpdateEvent_Brightness(), thecarimModelPackage.getPercentageT(), "brightness", null, 0, 1, DeviceRunningFeaturesUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceRunningFeaturesUpdateEvent_Volume(), thecarimModelPackage.getPercentageT(), "volume", null, 0, 1, DeviceRunningFeaturesUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceWorkloadUpdateEventEClass, DeviceWorkloadUpdateEvent.class, "DeviceWorkloadUpdateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceWorkloadUpdateEvent_MemoryUsage(), thecarimModelPackage.getPercentageT(), "memoryUsage", null, 0, 1, DeviceWorkloadUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceWorkloadUpdateEvent_CpuUsage(), thecarimModelPackage.getPercentageT(), "cpuUsage", null, 0, 1, DeviceWorkloadUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationContextEventEClass, CommunicationContextEvent.class, "CommunicationContextEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signalUpdateEventEClass, SignalUpdateEvent.class, "SignalUpdateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignalUpdateEvent_WirelessAccessType(), thecarimModelPackage.getWirelessAccessTypeT(), "wirelessAccessType", null, 0, 1, SignalUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalUpdateEvent_AccessPointName(), theXMLTypePackage.getString(), "accessPointName", null, 0, 1, SignalUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalUpdateEvent_SignalStrength(), thecarimModelPackage.getPercentageT(), "signalStrength", null, 0, 1, SignalUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(throughputUpdateEventEClass, ThroughputUpdateEvent.class, "ThroughputUpdateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThroughputUpdateEvent_ReceivedData(), theXMLTypePackage.getInt(), "receivedData", null, 0, 1, ThroughputUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThroughputUpdateEvent_SentData(), theXMLTypePackage.getInt(), "sentData", null, 0, 1, ThroughputUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverResponseUpdateEventEClass, ServerResponseUpdateEvent.class, "ServerResponseUpdateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerResponseUpdateEvent_Rtt(), theXMLTypePackage.getInt(), "rtt", null, 0, 1, ServerResponseUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerResponseUpdateEvent_Srt(), theXMLTypePackage.getInt(), "srt", null, 0, 1, ServerResponseUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationEventEClass, NavigationEvent.class, "NavigationEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(motionEventEClass, MotionEvent.class, "MotionEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textEventEClass, TextEvent.class, "TextEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(speechInputEventEClass, SpeechInputEvent.class, "SpeechInputEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(screenEventEClass, ScreenEvent.class, "ScreenEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(screenContentEventEClass, ScreenContentEvent.class, "ScreenContentEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScreenContentEvent_Nitems(), theXMLTypePackage.getInt(), "nitems", null, 0, 1, ScreenContentEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speechOutputEventEClass, SpeechOutputEvent.class, "SpeechOutputEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(speechOutputContentEventEClass, SpeechOutputContentEvent.class, "SpeechOutputContentEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeechOutputContentEvent_Nitems(), theXMLTypePackage.getInt(), "nitems", null, 0, 1, SpeechOutputContentEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(touchEventEClass, TouchEvent.class, "TouchEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clickEventEClass, ClickEvent.class, "ClickEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(longClickEventEClass, LongClickEvent.class, "LongClickEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scrollEventEClass, ScrollEvent.class, "ScrollEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moveEventEClass, MoveEvent.class, "MoveEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoveEvent_Length(), theXMLTypePackage.getInt(), "length", null, 0, 1, MoveEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationMoveEventEClass, NavigationMoveEvent.class, "NavigationMoveEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNavigationMoveEvent_Length(), theXMLTypePackage.getInt(), "length", null, 0, 1, NavigationMoveEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationActionEventEClass, NavigationActionEvent.class, "NavigationActionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationExploreEventEClass, NavigationExploreEvent.class, "NavigationExploreEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tiltEventEClass, TiltEvent.class, "TiltEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(twistEventEClass, TwistEvent.class, "TwistEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shakeEventEClass, ShakeEvent.class, "ShakeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(motionActionEventEClass, MotionActionEvent.class, "MotionActionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keyTextEventEClass, KeyTextEvent.class, "KeyTextEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyTextEvent_Code(), theXMLTypePackage.getInt(), "code", null, 0, 1, KeyTextEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyExploreEventEClass, KeyExploreEvent.class, "KeyExploreEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyExploreEvent_Code(), theXMLTypePackage.getInt(), "code", null, 0, 1, KeyExploreEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyCommandEventEClass, KeyCommandEvent.class, "KeyCommandEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyCommandEvent_Code(), theXMLTypePackage.getInt(), "code", null, 0, 1, KeyCommandEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textWordEventEClass, TextWordEvent.class, "TextWordEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textExploreEventEClass, TextExploreEvent.class, "TextExploreEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textCommandEventEClass, TextCommandEvent.class, "TextCommandEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guiElementsEventEClass, GuiElementsEvent.class, "GuiElementsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guiFeedbackEventEClass, GuiFeedbackEvent.class, "GuiFeedbackEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guiConceptsEventEClass, GuiConceptsEvent.class, "GuiConceptsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guiNoiseEventEClass, GuiNoiseEvent.class, "GuiNoiseEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guiQuestionsEventEClass, GuiQuestionsEvent.class, "GuiQuestionsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(speechElementsEventEClass, SpeechElementsEvent.class, "SpeechElementsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(speechFeedbackEventEClass, SpeechFeedbackEvent.class, "SpeechFeedbackEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(speechConceptsEventEClass, SpeechConceptsEvent.class, "SpeechConceptsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(speechNoiseEventEClass, SpeechNoiseEvent.class, "SpeechNoiseEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(speechQuestionsEventEClass, SpeechQuestionsEvent.class, "SpeechQuestionsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(correctAnswerEventEClass, CorrectAnswerEvent.class, "CorrectAnswerEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(incorrectAnswerEventEClass, IncorrectAnswerEvent.class, "IncorrectAnswerEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partiallyCorrectAnswerEventEClass, PartiallyCorrectAnswerEvent.class, "PartiallyCorrectAnswerEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notAnswerEventEClass, NotAnswerEvent.class, "NotAnswerEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openPromptEventEClass, OpenPromptEvent.class, "OpenPromptEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(halfOpenPromptEventEClass, HalfOpenPromptEvent.class, "HalfOpenPromptEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(closedPromptEventEClass, ClosedPromptEvent.class, "ClosedPromptEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noQuestionPromptEventEClass, NoQuestionPromptEvent.class, "NoQuestionPromptEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(overallWordsEventEClass, OverallWordsEvent.class, "OverallWordsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOverallWordsEvent_Nwords(), theXMLTypePackage.getInt(), "nwords", null, 0, 1, OverallWordsEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substitutedWordsEventEClass, SubstitutedWordsEvent.class, "SubstitutedWordsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubstitutedWordsEvent_Nwords(), theXMLTypePackage.getInt(), "nwords", null, 0, 1, SubstitutedWordsEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deletedWordsEventEClass, DeletedWordsEvent.class, "DeletedWordsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeletedWordsEvent_Nwords(), theXMLTypePackage.getInt(), "nwords", null, 0, 1, DeletedWordsEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertedWordsEventEClass, InsertedWordsEvent.class, "InsertedWordsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsertedWordsEvent_Nwords(), theXMLTypePackage.getInt(), "nwords", null, 0, 1, InsertedWordsEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overallSentencesEventEClass, OverallSentencesEvent.class, "OverallSentencesEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOverallSentencesEvent_Nsentences(), theXMLTypePackage.getInt(), "nsentences", null, 0, 1, OverallSentencesEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substitutedSentencesEventEClass, SubstitutedSentencesEvent.class, "SubstitutedSentencesEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubstitutedSentencesEvent_Nsentences(), theXMLTypePackage.getInt(), "nsentences", null, 0, 1, SubstitutedSentencesEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deletedSentencesEventEClass, DeletedSentencesEvent.class, "DeletedSentencesEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeletedSentencesEvent_Nsentences(), theXMLTypePackage.getInt(), "nsentences", null, 0, 1, DeletedSentencesEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertedSentencesEventEClass, InsertedSentencesEvent.class, "InsertedSentencesEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsertedSentencesEvent_Nsentences(), theXMLTypePackage.getInt(), "nsentences", null, 0, 1, InsertedSentencesEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overallConceptsEventEClass, OverallConceptsEvent.class, "OverallConceptsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOverallConceptsEvent_Nconcepts(), theXMLTypePackage.getInt(), "nconcepts", null, 0, 1, OverallConceptsEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substitutedConceptsEventEClass, SubstitutedConceptsEvent.class, "SubstitutedConceptsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubstitutedConceptsEvent_Nconcepts(), theXMLTypePackage.getInt(), "nconcepts", null, 0, 1, SubstitutedConceptsEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deletedConceptsEventEClass, DeletedConceptsEvent.class, "DeletedConceptsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeletedConceptsEvent_Nconcepts(), theXMLTypePackage.getInt(), "nconcepts", null, 0, 1, DeletedConceptsEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertedConceptsEventEClass, InsertedConceptsEvent.class, "InsertedConceptsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsertedConceptsEvent_Nconcepts(), theXMLTypePackage.getInt(), "nconcepts", null, 0, 1, InsertedConceptsEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(correctlyParsedUtteranceEventEClass, CorrectlyParsedUtteranceEvent.class, "CorrectlyParsedUtteranceEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partiallyParsedUtteranceEventEClass, PartiallyParsedUtteranceEvent.class, "PartiallyParsedUtteranceEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(incorrectlyParsedUtteranceEventEClass, IncorrectlyParsedUtteranceEvent.class, "IncorrectlyParsedUtteranceEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(newElementsEventEClass, NewElementsEvent.class, "NewElementsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(newFeedbackElementsEventEClass, NewFeedbackElementsEvent.class, "NewFeedbackElementsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(newConceptsEventEClass, NewConceptsEvent.class, "NewConceptsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(newNoiseEventEClass, NewNoiseEvent.class, "NewNoiseEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(newQuestionsEventEClass, NewQuestionsEvent.class, "NewQuestionsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(helpTurnEventEClass, HelpTurnEvent.class, "HelpTurnEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(correctionTurnEventEClass, CorrectionTurnEvent.class, "CorrectionTurnEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cancelTurnEventEClass, CancelTurnEvent.class, "CancelTurnEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(restartTurnEventEClass, RestartTurnEvent.class, "RestartTurnEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bargeinEventEClass, BargeinEvent.class, "BargeinEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBargeinEvent_Successful(), theXMLTypePackage.getBoolean(), "successful", null, 0, 1, BargeinEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(divRejectionEventEClass, DIVRejectionEvent.class, "DIVRejectionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(asrRejectionEventEClass, ASRRejectionEvent.class, "ASRRejectionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(grRejectionEventEClass, GRRejectionEvent.class, "GRRejectionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeoutEventEClass, TimeoutEvent.class, "TimeoutEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(appStartEventEClass, AppStartEvent.class, "AppStartEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(appEndEventEClass, AppEndEvent.class, "AppEndEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startDialogueEventEClass, StartDialogueEvent.class, "StartDialogueEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endDialogueEventEClass, EndDialogueEvent.class, "EndDialogueEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startSystemTurnEventEClass, StartSystemTurnEvent.class, "StartSystemTurnEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endSystemTurnEventEClass, EndSystemTurnEvent.class, "EndSystemTurnEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startUserTurnEventEClass, StartUserTurnEvent.class, "StartUserTurnEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endUserTurnEventEClass, EndUserTurnEvent.class, "EndUserTurnEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemFeedbackStartEventEClass, SystemFeedbackStartEvent.class, "SystemFeedbackStartEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemActionStartEventEClass, SystemActionStartEvent.class, "SystemActionStartEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemActionEndEventEClass, SystemActionEndEvent.class, "SystemActionEndEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userFeedbackStartEventEClass, UserFeedbackStartEvent.class, "UserFeedbackStartEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userActionStartEventEClass, UserActionStartEvent.class, "UserActionStartEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userActionEndEventEClass, UserActionEndEvent.class, "UserActionEndEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(event_tEEnum, event_t.class, "event_t");
		addEEnumLiteral(event_tEEnum, event_t.TOUCH);
		addEEnumLiteral(event_tEEnum, event_t.CLICK);
		addEEnumLiteral(event_tEEnum, event_t.LONGCLICK);
		addEEnumLiteral(event_tEEnum, event_t.ITEMCLICK);
		addEEnumLiteral(event_tEEnum, event_t.ITEMLONGCLICK);
		addEEnumLiteral(event_tEEnum, event_t.SCROLL);
		addEEnumLiteral(event_tEEnum, event_t.MOVE);
		addEEnumLiteral(event_tEEnum, event_t.TILT);
		addEEnumLiteral(event_tEEnum, event_t.TWIST);
		addEEnumLiteral(event_tEEnum, event_t.SHAKE);
		addEEnumLiteral(event_tEEnum, event_t.NAVIGATIONMOVE);
		addEEnumLiteral(event_tEEnum, event_t.NAVIGATIONLENGTH);
		addEEnumLiteral(event_tEEnum, event_t.NAVIGATIONACTION);
		addEEnumLiteral(event_tEEnum, event_t.NAVIGATIONEXPLORE);
		addEEnumLiteral(event_tEEnum, event_t.MOTIONACTION);
		addEEnumLiteral(event_tEEnum, event_t.KEYTEXT);
		addEEnumLiteral(event_tEEnum, event_t.KEYEXPLORE);
		addEEnumLiteral(event_tEEnum, event_t.KEYCOMMAND);
		addEEnumLiteral(event_tEEnum, event_t.TEXTWORD);
		addEEnumLiteral(event_tEEnum, event_t.TEXTEXPLORE);
		addEEnumLiteral(event_tEEnum, event_t.TEXTCOMMAND);
		addEEnumLiteral(event_tEEnum, event_t.OVERALLWORDS);
		addEEnumLiteral(event_tEEnum, event_t.SUBSTITUTEDWORDS);
		addEEnumLiteral(event_tEEnum, event_t.DELETEDWORDS);
		addEEnumLiteral(event_tEEnum, event_t.INSERTEDWORDS);
		addEEnumLiteral(event_tEEnum, event_t.OVERALLSENTENCES);
		addEEnumLiteral(event_tEEnum, event_t.SUBSTITUTEDSENTENCES);
		addEEnumLiteral(event_tEEnum, event_t.DELETEDSENTENCES);
		addEEnumLiteral(event_tEEnum, event_t.INSERTEDSENTENCES);
		addEEnumLiteral(event_tEEnum, event_t.OVERALLCONCEPTS);
		addEEnumLiteral(event_tEEnum, event_t.SUBSTITUTEDCONCEPTS);
		addEEnumLiteral(event_tEEnum, event_t.DELETEDCONCEPTS);
		addEEnumLiteral(event_tEEnum, event_t.INSERTEDCONCEPTS);
		addEEnumLiteral(event_tEEnum, event_t.CORRECTLYPARSEDUTTERANCE);
		addEEnumLiteral(event_tEEnum, event_t.PARTIALLYPARSEDUTTERANCE);
		addEEnumLiteral(event_tEEnum, event_t.INCORRECTLYPARSEDUTTERANCE);
		addEEnumLiteral(event_tEEnum, event_t.GUIELEMENTS);
		addEEnumLiteral(event_tEEnum, event_t.GUIFEEDBACK);
		addEEnumLiteral(event_tEEnum, event_t.GUICONCEPTS);
		addEEnumLiteral(event_tEEnum, event_t.GUINOISE);
		addEEnumLiteral(event_tEEnum, event_t.GUIQUESTIONS);
		addEEnumLiteral(event_tEEnum, event_t.SPEECHELEMENTS);
		addEEnumLiteral(event_tEEnum, event_t.SPEECHFEEDBACK);
		addEEnumLiteral(event_tEEnum, event_t.SPEECHCONCEPTS);
		addEEnumLiteral(event_tEEnum, event_t.SPEECHNOISE);
		addEEnumLiteral(event_tEEnum, event_t.SPEECHQUESTIONS);
		addEEnumLiteral(event_tEEnum, event_t.NEWELEMENTS);
		addEEnumLiteral(event_tEEnum, event_t.NEWFEEDBACKELEMENTS);
		addEEnumLiteral(event_tEEnum, event_t.NEWCONCEPTS);
		addEEnumLiteral(event_tEEnum, event_t.NEWNOISE);
		addEEnumLiteral(event_tEEnum, event_t.NEWQUESTIONS);
		addEEnumLiteral(event_tEEnum, event_t.HELPTURN);
		addEEnumLiteral(event_tEEnum, event_t.CORRECTIONTURN);
		addEEnumLiteral(event_tEEnum, event_t.TIMEOUT);
		addEEnumLiteral(event_tEEnum, event_t.CANCELTURN);
		addEEnumLiteral(event_tEEnum, event_t.RESTARTTURN);
		addEEnumLiteral(event_tEEnum, event_t.BARGEIN);
		addEEnumLiteral(event_tEEnum, event_t.DIVREJECTION);
		addEEnumLiteral(event_tEEnum, event_t.ASRREJECTION);
		addEEnumLiteral(event_tEEnum, event_t.GRREJECTION);
		addEEnumLiteral(event_tEEnum, event_t.CORRECTANSWER);
		addEEnumLiteral(event_tEEnum, event_t.INCORRECTANSWER);
		addEEnumLiteral(event_tEEnum, event_t.PARTIALLYCORRECTANSWER);
		addEEnumLiteral(event_tEEnum, event_t.NOTANSWER);
		addEEnumLiteral(event_tEEnum, event_t.OPENPROMPT);
		addEEnumLiteral(event_tEEnum, event_t.HALFOPENPROMPT);
		addEEnumLiteral(event_tEEnum, event_t.CLOSEDPROMPT);
		addEEnumLiteral(event_tEEnum, event_t.NOQUESTIONPROMPT);
		addEEnumLiteral(event_tEEnum, event_t.WEATHERUPDATE);
		addEEnumLiteral(event_tEEnum, event_t.AMBIENTUPDATE);
		addEEnumLiteral(event_tEEnum, event_t.USERDATAUPDATE);
		addEEnumLiteral(event_tEEnum, event_t.USERRATINGSUPDATE);
		addEEnumLiteral(event_tEEnum, event_t.USERATTITUDEUPDATE);
		addEEnumLiteral(event_tEEnum, event_t.USERMOODUPDATE);
		addEEnumLiteral(event_tEEnum, event_t.SOCIALUPDATE);
		addEEnumLiteral(event_tEEnum, event_t.LOCATIONUPDATE);
		addEEnumLiteral(event_tEEnum, event_t.MOBILITYUPDATE);
		addEEnumLiteral(event_tEEnum, event_t.TIMEUPDATE);
		addEEnumLiteral(event_tEEnum, event_t.DEVICEFEATURESUPDATE);
		addEEnumLiteral(event_tEEnum, event_t.DEVICERUNNINGFEATURESUPDATE);
		addEEnumLiteral(event_tEEnum, event_t.DEVICEWORKLOADUPDATE);
		addEEnumLiteral(event_tEEnum, event_t.SIGNALUPDATE);
		addEEnumLiteral(event_tEEnum, event_t.THROUGHPUTUPDATE);
		addEEnumLiteral(event_tEEnum, event_t.SERVERRESPONSEUPDATE);
		addEEnumLiteral(event_tEEnum, event_t.APPSTART);
		addEEnumLiteral(event_tEEnum, event_t.APPEND);
		addEEnumLiteral(event_tEEnum, event_t.STARTDIALOGUE);
		addEEnumLiteral(event_tEEnum, event_t.ENDDIALOGUE);
		addEEnumLiteral(event_tEEnum, event_t.STARTSYSTEMTURN);
		addEEnumLiteral(event_tEEnum, event_t.SYSTEMFEEDBACKSTART);
		addEEnumLiteral(event_tEEnum, event_t.SYSTEMACTIONSTART);
		addEEnumLiteral(event_tEEnum, event_t.SYSTEMACTIONEND);
		addEEnumLiteral(event_tEEnum, event_t.ENDSYSTEMTURN);
		addEEnumLiteral(event_tEEnum, event_t.STARTUSERTURN);
		addEEnumLiteral(event_tEEnum, event_t.USERFEEDBACKSTART);
		addEEnumLiteral(event_tEEnum, event_t.USERACTIONSTART);
		addEEnumLiteral(event_tEEnum, event_t.USERACTIONEND);
		addEEnumLiteral(event_tEEnum, event_t.ENDUSERTURN);

		// Create resource
		createResource(eNS_URI);
	}

} //EventsPackageImpl
