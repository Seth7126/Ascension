// 函数: _ZN14ascensionrules26CStateProcessAcquirePortal19SelectAcquireToHandER13CStateMachineP6CStateiPj
// 地址: 0x160af4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg3 == 0)
    return 

ascension::CPlayer* r6_1 = *(arg2 + 0x24c)
CStateMachine& r8_1 = arg1
int32_t r10_1 = *(r6_1 + 4)

if (*(arg2 + 0x25c) == 1)
label_160b28:
    uint32_t r2_2 = *(arg2 + 0x254)
    
    if (r2_2 == 7)
        ascension::CWorld::RemoveCenterRowCard(r10_1, (*(arg2 + 0x258)).b)
        ascension::CWorld::PutCardOnCenterRow(r10_1, *(arg2 + 0x258), arg3)
        r2_2 = *(arg2 + 0x254)
    
    ascensionrules::CreateStateProcessAcquireCardSequence(r6_1, arg3, r2_2, *(arg2 + 0x258), 1, 
        nullptr, 0)
    return CStateMachine::PushOwnedState(r8_1) __tailcall

arg1 = *(arg2 + 0x268)

if (arg1 s< 1)
    return 

void* __offset(CState, 0x2ac) r4_1 = arg2 + 0x2ac
int32_t r1_5 = 0

while (*(r4_1 - 0x40) != arg3)
    r1_5 += 1
    r4_1 += 0x44
    
    if (r1_5 s>= arg1)
        return 

void* r0_7 = *r4_1

if (r0_7 == 0xffffffff)
    r0_7 = memchr(r4_1 - 0x20, 1, *(r4_1 - 0x24)) - (r4_1 - 0x20)

if (zx.d(*(r4_1 + (r0_7 << 1) - 0x10)) != 0)
    core::CWorldBase::GetInstanceByID(r10_1)
    ascension::CWorld::PlayActiveEffect(r10_1)

goto label_160b28
