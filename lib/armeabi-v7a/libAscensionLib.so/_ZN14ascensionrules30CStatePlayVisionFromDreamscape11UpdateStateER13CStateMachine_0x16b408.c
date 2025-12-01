// 函数: _ZN14ascensionrules30CStatePlayVisionFromDreamscape11UpdateStateER13CStateMachine
// 地址: 0x16b408
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

CState::DeleteState(*(arg1 + 0x38))
uint32_t r1 = zx.d(*(arg1 + 0x83c))
*(arg1 + 0x38) = 0
CState* entry_r1

if (r1 != 0)
    void* r1_1 = *(arg1 + 0x34)
    *(arg1 + 0x83c) = 0
    
    if (zx.d(*(*(r1_1 + 0xc) + 0xd4)) == 0)
        ascension::CEvent* r6_1 = *(*(arg1 + 0x30) + 4)
        *(arg1 + 0x894) = 0x14
        *(arg1 + 0x898) = 0xb
        *(arg1 + 0x89c) = 0
        *(arg1 + 0x8a4) = 0
        ascension::CWorld::HandleEvent(r6_1)
        
        if (zx.d(*(arg1 + 0x848)) != 0)
            *(arg1 + 0x38) = ascensionrules::CreateStateHandleEvent(r6_1, arg1 + 0x840, false, 0, 
                arg1 + 0x3c, 0x800)
            return CStateMachine::PushState(entry_r1) __tailcall

return CStateMachine::PopState(entry_r1) __tailcall
