// 函数: _ZN14ascensionrules35CStateProcessDestroyConstructInPlay24SelectConstructToDestroyER13CStateMachineP6CStateiPj
// 地址: 0x13c6e8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = *(arg2 + 0x258)
int32_t r7 = *(arg2 + 0x24c)

if (r0 != 0)
    void* r3_1 = r0 + *r0 + 4
    uint32_t r2_1 = zx.d(*r3_1)
    
    if (r2_1 u<= 7)
        uint32_t r6_1 = zx.d(*(arg3 + 8))
        *r3_1 = r2_1.b + 1
        r0[*r0 * 8 + r2_1 + 4] = r6_1

uint8_t r4_2

if (zx.d(*(arg2 + 0x44)) == 0)
    r4_2 = 0
else
    int32_t temp0_1 = 0
    uint32_t i = *(arg2 + 0x38) - 1
    
    while (i != 0)
        i u>>= 1
        temp0_1 += 1
    
    r4_2 = ((0x20 - temp0_1) u>> 5).b

void** r0_7 = operator new(0x3c)
CState::CState()
*r0_7 = _vtable_for_ascensionrules::CStateDiscardConstruct + 8
r0_7[0xc] = r7
r0_7[0xd] = arg3
r0_7[0xe].b = r4_2
return CStateMachine::PushOwnedState(arg1) __tailcall
