// 函数: _ZN14ascensionrules50CStateEachOpponentDiscardsAllButOneConstructInPlay10EnterStateER13CStateMachine
// 地址: 0x13f498
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result = *(arg1 + 0x38)
void* r8 = *(result + 4)
int32_t r1 = *(r8 + 0x18)
int32_t r3_1 = 0

if (*(r8 + 0x30) u< 2)
    r3_1 = 1

if (r1 != *(r8 + 0x1c))
    int32_t r7_1 = r1 + 4
    
    while (true)
        ascension::CPlayer* r5_1 = *(r7_1 - 4)
        
        if (result != r5_1)
            CState* r0 = operator new(0x2b0)
            CGameStateOptions::CGameStateOptions(r0.b)
            *(r0 + 0x2a0) = 0
            *(r0 + 0x2a4) = 0
            *(r0 + 0x2a8) = 0
            *(r0 + 0x2ac) = 0
            *(r0 + 0x24c) = r5_1
            *r0 = _vtable_for_ascensionrules::CStateProcessDiscardAllButOneConstructInPlay + 8
            *(r0 + 0x250) = 0
            *(r0 + 0x254) = _vtable_for_ascension::CEventPreventDestroyConstruct + 8
            *(r0 + 0x258) = 0x19
            *(r0 + 0x25c) = 0
            int32_t r0_4
            
            if (zx.d(*(r8 + 0xa2d)) != 0)
                r0_4 = ascension::CPlayer::CountConstructsInPlay(r5_1, false, nullptr)
            
            if (zx.d(*(r8 + 0xa2d)) == 0 || r0_4 s<= r3_1)
                CState::AddOwnedChild(arg1)
                CStateList::AppendState(arg1)
            else
                ascensionrules::CreateStateProcessPendingAsyncResolveEffect(*(arg1 + 0x38), 
                    *(*(r8 + 0xbdc) - 8), nullptr, 0, r5_1, r0, false)
                ascension::CPlayer::AddPendingAsyncState(r5_1)
        
        result = *(r8 + 0x1c)
        
        if (r7_1 == result)
            break
        
        result = *(arg1 + 0x38)
        r7_1 += 4

return result
