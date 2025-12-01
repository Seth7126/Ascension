// 函数: _ZN14ascensionrules34CStateEachOpponentDiscardsFromHand10EnterStateER13CStateMachine
// 地址: 0x144d1c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result = *(arg1 + 0x38)
void* r9 = *(result + 4)
int32_t r1 = *(r9 + 0x18)

if (r1 != *(r9 + 0x1c))
    int32_t r4_1 = r1 + 4
    
    while (true)
        ascension::CPlayer* r6_1 = *(r4_1 - 4)
        
        if (result != r6_1)
            CState* r0 = operator new(0x2bc)
            CGameStateOptions::CGameStateOptions(r0.b)
            *r0 = _vtable_for_ascensionrules::CStateProcessDiscardFromHand + 8
            *(r0 + 0x24c) = r6_1
            *(r0 + 0x250) = 0
            *(r0 + 0x254) = 0
            *(r0 + 0x258) = 0
            *(r0 + 0x260) = 0x1a
            *(r0 + 0x264) = 0
            *(r0 + 0x2a8) = r6_1
            *(r0 + 0x2ac) = 0
            *(r0 + 0x2b0) = 0
            *(r0 + 0x2b4) = 0
            *(r0 + 0x2b8) = 0
            *(r0 + 0x25c) = _vtable_for_ascension::CEventDiscardCardsFromHand + 8
            int32_t r0_3 = operator new(0x10)
            *(r0 + 0x2b0) = r0_3
            *(r0 + 0x2b4) = r0_3
            *(r0 + 0x2b8) = r0_3 + 0x10
            
            if (zx.d(*(r9 + 0xa2d)) == 0)
                CState::AddOwnedChild(arg1)
                CStateList::AppendState(arg1)
            else
                ascensionrules::CreateStateProcessPendingAsyncResolveEffect(*(arg1 + 0x38), 
                    *(*(r9 + 0xbdc) - 8), nullptr, 0, r6_1, r0, false)
                ascension::CPlayer::AddPendingAsyncState(r6_1)
        
        result = *(r9 + 0x1c)
        
        if (r4_1 == result)
            break
        
        result = *(arg1 + 0x38)
        r4_1 += 4

return result
