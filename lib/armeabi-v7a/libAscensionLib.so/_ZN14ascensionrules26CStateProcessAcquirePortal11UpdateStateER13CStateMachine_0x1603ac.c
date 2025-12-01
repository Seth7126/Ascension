// 函数: _ZN14ascensionrules26CStateProcessAcquirePortal11UpdateStateER13CStateMachine
// 地址: 0x1603ac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0x30) == 0 && *(arg1 + 0x38) s<= 0)
    if (zx.d(*(arg1 + 0x264)) != 0)
        int32_t result = ascension::CWorld::OutputPauseBrief(*(*(arg1 + 0x24c) + 4))
        *(arg1 + 0x264) = 0
        return result
    
    if (zx.d(*(arg1 + 0x265)) != 0)
        int32_t* r6 = *(arg1 + 0x250)
        void* r0_8 = *(arg1 + 0x24c)
        uint32_t r5 = *(r0_8 + 4)
        *(arg1 + 0x260) = r6[4]
        ascension::CWorld::OutputEvent(r5, 0x1a, zx.d(*(r0_8 + 8)), zx.d(r6[2].w))
        core::CWorldBase::OutputMessageFormat(r5, "%s reveals %s\n", (*(*r6 + 0xc))(r6), 
            (*(**(arg1 + 0x260) + 0xc))(), 0)
        ascension::CWorld::PushRevealCard(r5, *(arg1 + 0x260), 3)
        uint32_t var_20 = zx.d(*(*(arg1 + 0x250) + 8))
        ascension::CWorld::OutputAnimationCard(r5, *(arg1 + 0x260), 0xa, 0xb, 0, 0xc, 0, 0xa)
        ascension::CWorld::OutputPauseForAnimationConfirmation()
        ascension::CWorld::OutputPauseForAnimationToDestination(r5)
        *(arg1 + 0x264) = 1
        return 0x264
    
    if (zx.d(*(arg1 + 0x266)) == 0)
        ascensionrules::CStateProcessAcquirePortal::BuildOptionList(arg1)
        *(arg1 + 0x266) = 1
        return 1

return CGameStateOptions::UpdateState(arg1) __tailcall
