// 函数: _ZN14ascensionrules36CStateTakeRandomCardFromEachOpponent10EnterStateER13CStateMachine
// 地址: 0x14a81c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r6 = *(arg1 + 0x38)
void* r9 = *(r6 + 4)
int32_t r1 = *(r9 + 0x18)
int32_t result = *(r9 + 0x1c)

if (r1 != result)
    int32_t r7_1 = r1 + 4
    
    while (true)
        int32_t r4_1 = *(r7_1 - 4)
        
        if (r6 != r4_1)
            void** r0 = operator new(0x38)
            CState::CState()
            *r0 = _vtable_for_ascensionrules::CStateProcessTakeRandomCardFromOpponent + 8
            r0[0xc] = r6
            r0[0xd] = r4_1
            CState::AddOwnedChild(arg1)
            CStateList::AppendState(arg1)
            result = *(r9 + 0x1c)
        
        if (r7_1 == result)
            break
        
        r6 = *(arg1 + 0x38)
        r7_1 += 4

return result
