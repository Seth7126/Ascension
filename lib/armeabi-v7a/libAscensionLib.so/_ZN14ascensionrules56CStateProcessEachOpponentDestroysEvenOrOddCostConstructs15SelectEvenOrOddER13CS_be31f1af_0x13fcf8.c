// 函数: _ZN14ascensionrules56CStateProcessEachOpponentDestroysEvenOrOddCostConstructs15SelectEvenOrOddER13CStateMachineP6CStateiPj
// 地址: 0x13fcf8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r10 = *(arg2 + 0x24c)
int32_t r9 = arg3

if (arg3 != 0)
    r9 = 1

void* r4 = *(r10 + 4)
int32_t* i = *(r4 + 0x18)
int32_t result

for (result = *(r4 + 0x1c); i != result; i = &i[1])
    ascension::CPlayer* r7_1 = *i
    
    if (r10 != r7_1)
        void** r0_2 = operator new(0xa0)
        CStateList::CStateList()
        r0_2[0x24] = 0
        r0_2[0x25] = 0
        r0_2[0x26] = 0
        r0_2[0x27] = 0
        *r0_2 = _vtable_for_ascensionrules::CStateProcessDestroyEvenOrOddConstructs + 8
        r0_2[0xe] = r7_1
        r0_2[0xf] = r9
        r0_2[0x11] = _vtable_for_ascension::CEventPreventDestroyConstruct + 8
        r0_2[0x12] = 0x19
        r0_2[0x13] = 0
        
        if (zx.d(*(r4 + 0xa2d)) == 0)
            CState::AddOwnedChild(arg2)
            CStateList::AppendState(arg2)
        else
            ascensionrules::CreateStateProcessPendingAsyncResolveEffect(r10, *(*(r4 + 0xbdc) - 8), 
                nullptr, 0, r7_1, r0_2, false)
            ascension::CPlayer::AddPendingAsyncState(r7_1)
    
    result = *(r4 + 0x1c)

return result
