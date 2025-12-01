// 函数: _ZN14ascensionrules30CStateDefeatMonsterFromKingdom11UpdateStateER13CStateMachine
// 地址: 0x16bad8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

CState::DeleteState(*(arg1 + 0x40))
uint32_t r0_1 = zx.d(*(arg1 + 0x844))
*(arg1 + 0x40) = 0
CState* entry_r1

if (r0_1 != 0)
    void* r2_1 = *(arg1 + 0x30)
    int32_t r7_1 = 5
    int32_t r3_1 = *(arg1 + 0x34)
    *(arg1 + 0x844) = 0
    ascension::CWorld* r0_2 = *(r2_1 + 4)
    bool cond:0_1 = zx.d(*(arg1 + 0x3c)) == 0
    *(arg1 + 0x850) = 0
    
    if (cond:0_1)
        r7_1 = 9
    
    *(arg1 + 0x894) = r2_1
    *(arg1 + 0x898) = r3_1
    *(arg1 + 0x89c) = 6
    *(arg1 + 0x8a0) = 0xffffffff
    *(arg1 + 0x8a4) = 0
    *(arg1 + 0x8a8) = r7_1
    *(arg1 + 0x8ac) = 0
    *(arg1 + 0x40) =
        ascensionrules::CreateStateHandleEvent(r0_2, arg1 + 0x848, true, 0, arg1 + 0x44, 0x800)
    CStateMachine::PushState(entry_r1)

return CStateMachine::PopState(entry_r1) __tailcall
