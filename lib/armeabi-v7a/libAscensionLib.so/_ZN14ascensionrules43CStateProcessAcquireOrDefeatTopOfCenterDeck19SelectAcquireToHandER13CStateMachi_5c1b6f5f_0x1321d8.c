// 函数: _ZN14ascensionrules43CStateProcessAcquireOrDefeatTopOfCenterDeck19SelectAcquireToHandER13CStateMachineP6CStateiPj
// 地址: 0x1321d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg3 == 0)
    return 

core::CCardInstance* r6_1 = *(arg2 + 0x24c)
int32_t r0_1 = *(*(arg3 + 0xc) + 0x88)

if (r0_1 == 6)
    if (zx.d(*(arg2 + 0x252)) != 0)
    label_1322e4:
        int32_t var_24 = 1
        ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
            operator new(0x990), r6_1, arg3, 0xc, 0)
        CState::AddOwnedChild(arg2)
        return CStateList::AppendState(arg2) __tailcall
else if (r0_1 == 2)
    if (zx.d(*(arg2 + 0x251)) != 0)
        goto label_1322e4
else if (r0_1 != 1 || zx.d(*(arg2 + 0x250)) != 0)
    goto label_1322e4

arg1 = *(arg2 + 0x25c)

if (arg1 s< 1)
    return 

ascension::CActiveEffectInstance* r8_1 = *(r6_1 + 4)
void* __offset(CState, 0x2a0) r7_1 = arg2 + 0x2a0
int32_t r1 = 0

while (*(r7_1 - 0x40) != arg3)
    r1 += 1
    r7_1 += 0x44
    
    if (r1 s>= arg1)
        return 

void* r0_5 = *r7_1

if (r0_5 == 0xffffffff)
    r0_5 = memchr(r7_1 - 0x20, 1, *(r7_1 - 0x24)) - (r7_1 - 0x20)

if (zx.d(*(r7_1 + (r0_5 << 1) - 0x10)) != 0)
    core::CWorldBase::GetInstanceByID(r8_1)
    ascension::CWorld::PlayActiveEffect(r8_1)

goto label_1322e4
