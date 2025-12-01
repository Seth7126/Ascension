// 函数: _ZN14ascensionrules36CStateEachOpponentDiscardsRandomCard10EnterStateER13CStateMachine
// 地址: 0x1446f0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result = *(arg1 + 0x38)
void* r7 = *(result + 4)
int32_t r1 = *(r7 + 0x18)

if (r1 != *(r7 + 0x1c))
    int32_t r4_1 = r1 + 4
    
    while (true)
        ascension::CPlayer* r5_1 = *(r4_1 - 4)
        
        if (result != r5_1)
            void** r0 = operator new(0x34)
            CState::CState()
            r0[0xc] = r5_1
            *r0 = _vtable_for_ascensionrules::CStateProcessDiscardRandomCard + 8
            
            if (zx.d(*(r7 + 0xa2d)) == 0)
                CState::AddOwnedChild(arg1)
                CStateList::AppendState(arg1)
            else
                ascensionrules::CreateStateProcessPendingAsyncResolveEffect(*(arg1 + 0x38), 
                    *(*(r7 + 0xbdc) - 8), nullptr, 0, r5_1, r0, false)
                ascension::CPlayer::AddPendingAsyncState(r5_1)
        
        result = *(r7 + 0x1c)
        
        if (r4_1 == result)
            break
        
        result = *(arg1 + 0x38)
        r4_1 += 4

return result
