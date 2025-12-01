// 函数: _ZN14ascensionrules33CStateProcessDiscardMultipleCards11UpdateStateER13CStateMachine
// 地址: 0x144080
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0x30) == 0 && *(arg1 + 0x38) s<= 0)
    int32_t r0_4 = *(arg1 + 0x264)
    
    if (r0_4 s< *(arg1 + 0x250))
        ascensionrules::CStateProcessDiscardMultipleCards::PrepareDiscardList(arg1)
        int32_t result = *(arg1 + 0x38)
        
        if (result s> 0)
            return result
        
        r0_4 = *(arg1 + 0x264)
    
    if (r0_4 s>= 1 && zx.d(*(arg1 + 0x268)) == 0)
        void* r0_7 = *(arg1 + 0x24c)
        int32_t r1_4 = *(arg1 + 0x25c)
        *(arg1 + 0x268) = 1
        ascension::CWorld* r0_8 = *(r0_7 + 4)
        *(arg1 + 0x2bc) = r1_4
        ascensionrules::CreateStateHandleEvent(r0_8, arg1 + 0x26c, true, 0, nullptr, 0)
        CState* entry_r1
        return CStateMachine::PushOwnedState(entry_r1) __tailcall

return CGameStateOptions::UpdateState(arg1) __tailcall
